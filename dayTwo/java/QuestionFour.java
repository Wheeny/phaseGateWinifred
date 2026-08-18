public class QuestionThree{
    public static void main(String [] args){
    
    for(int count = 0; count <= 100; count++){
        if(count % 3 == 0){
            System.out.println("hello");
        }
        else if(count % 5 == 0){
            System.out.print("world");
        }
        else if(count % 7 == 0){
            System.out.println("orion");
        }
        else {
           System.out.println(count); 
        }
    }
    
    
    }


}



