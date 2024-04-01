public class switch1 {  
    public static void main(String[] args) {
        String str="Mondy";
        switch(str){
            case "Sunday"->System.out.println("10");
            case "monday"->System.out.println("9");
            case "tuesday"->System.out.println("8");
            default->System.out.println("sleep");
        }
    }
}
