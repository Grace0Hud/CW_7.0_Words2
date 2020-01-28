//represents a dictionary, which is a book
public class Dictionary2 extends Book2
{
    private int definitions;
    //sets of dictionary with a specific number of pages and definitions
    public Dictionary2(int numPages, int numDefinitions)
    {
        super(numPages);
        definitions = numDefinitions;
    }//emd of const
    //prints messsages using local and inherited values
    public void definitionMessage()
    {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Defintions per page: " + definitions/pages);
    }//end of definition message

}//end of dictionary class
