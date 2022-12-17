package ru.mirea.lab26;

public class HashTable {
    private static final int initCap=10;
    private int cap;
    private int used;

    private Object[] k;
    private Object[] v;
    private boolean[] deleted;

    public HashTable() {
        used=0;
        cap=initCap;
        k = new Object[initCap];
        v = new Object[initCap];
        deleted = new boolean[initCap];
        for(int i=0;i<initCap;++i)
            deleted[i]=false;
    }
    private int hashtabHash(Object obj){
        String str=obj.toString();
        int res=0;
        for(int i=0;i<str.length();i+=2){
            res+=str.charAt(i);
        }
        return res%cap;
    }
    private void rehash(){
        cap*=2;
        Object[] newK = new Object[cap];
        Object[] newV = new Object[cap];
        boolean[] newDel = new boolean[cap];
        for(int i=0;i<cap;++i)
            newDel[i]=false;
        for(int i=0;i<cap;++i){
            int hash= hashtabHash(k[i]);
            while(newK[hash]!=null)
                hash=(hash+1)%cap;
            newK[hash]=k[i];
            newV[hash]=v[i];
        }
        k=newK;
        v=newV;
        deleted = newDel;
    }
    public void hashtabAdd(Object key, Object value){
        if((double)used/cap>=0.75)
            rehash();
        int hash= hashtabHash(key);
        while(k[hash]!=null)
            hash=(hash+1)%cap;
        k[hash]=key;
        v[hash]=value;
        ++used;
    }
    public void hashtabDelete(Object key){
        int hash= hashtabHash(key);
        if(k[hash]==key){
            k[hash]=null;
            v[hash]=null;
            deleted[hash]=true;
            return;
        }

        int startHash=hash;
        hash=(hash+1)%cap;
        while(k[hash]!=key && startHash!=hash)
            hash=(hash+1)%cap;
        if(k[hash]==key){
            k[hash]=null;
            v[hash]=null;
            deleted[hash]=true;
        }
    }
    public Object hashtabLookup(Object key){
        int hash= hashtabHash(key);
        if(k[hash]==key)
            return v[hash];


        int startHash=hash;
        hash=(hash+1)%cap;
        while((k[hash]!=key || deleted[hash]) && startHash!=hash)
            hash=(hash+1)%cap;
        if(k[hash]==key)
            return v[hash];
        return null;
    }
}
