package ru.mirea.lab18;

public class ThrowsDemo {

//    public String getDetails(String str){
//        if(str==null)
//            throw new NullPointerException("Empty String");
//        return "Details are "+str;
//    }
    public void printMessage(String key){
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String str){
        try {
            if (str == null)
                throw new NullPointerException("Empty String");
        }catch(NullPointerException ne){
            System.out.println("NullPtrException has been caught");
        }
        return "Details are "+str;
    }

    public static void main(String[] args) {
        new ThrowsDemo().getDetails(null);
//        new ThrowsDemo().printMessage("not null");
    }
}
