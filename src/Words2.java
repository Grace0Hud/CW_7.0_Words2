public class Words2
{
    //instantiates a derived class and invokes
    // its inherited and local methods
    public static void main(String[] args)
    {
        Dictionary2 webster = new Dictionary2(1500,52500);
        webster.pageMessage();
        webster.definitionMessage();
        System.out.println("By Grace Hudgens");
    }//end of main method
}//end of words2
