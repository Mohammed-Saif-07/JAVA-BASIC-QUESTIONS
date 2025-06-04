/* 

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        } 
        catch(Exception e){
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("bye");
    }   
}

*/

//-------------PRINT EXCEPTION---------------------------

/* 

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        } 
        catch(Exception e){
            System.out.println("Something went wrong." + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }   
}

*/

//---------ARRAY INDEX OUT OF BONDS EXCEPTION--------------------

/* 

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];

        try{
            j = 18/i;
            //System.out.println(nums[1]);
            System.out.println(nums[5]);
        } 
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("bye");
    }   
}

*/

//--------------MULTIPLE CATCH---------------------

/*    

//          AIRTHEMETIC EXCEPTION

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    }   
}

//         NullPointerException

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    }   
}

//         ArrayIndexOutOfBoundsException

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        String str = "saif";

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    }   
}

*/ 

//------------THROW---------------------

/* 

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException();
         } 
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("default output" + e);
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}

*/

//---------------CUSTOM EXCEPTION---------------

// Made  a new class and connstructor for custom exception i.e. SaifException

/* 

class SaifException extends Exception{
    public SaifException(String str){
        super(str);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new SaifException("custom exception");
         } 
        catch(SaifException e){
            j = 18/1;
            System.out.println("default output " + e);
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}

*/

//-------------DUCKING EXCEPTION-----------------

/* 

class A{
    public void show(){
                try{
            Class.forName("Demo");
        } catch(ClassNotFoundException e){
            System.out.println("no class found" + e);
        }
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }   
}

*/

//---------------ANOTHER MEOTHOD--------------------

/* 

class A {
    public void show() {
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

public class ExceptionHandling {
    static {
        System.out.println("Class");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}

*/
