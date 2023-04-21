public class Stri {
    public static void main(String[] args) {
        //typing multi line string

        String s= "let us type something";
        System.out.println(s);

        String s1= """
                
                
                Changes in Stack Memory when a method is called:               
                In the stack memory, a new memory block is created for every method that is called. 
                All the primitive data values specific to that method and references to objects referred 
                from the method are stored in this memory block.
                When the method completes its execution, the memory block is cleared from the stack
                memory and the stack memory is available for use.
                The values in the stack exist for as long as the function that created them is in execution.
                The size of the stack memory is fixed and cannot grow or shrink once created.
                """;

        System.out.println(s1);

        //find letter at particular index number.

        System.out.println(s1.charAt(8));
        System.out.println(s1.charAt(18));
        System.out.println(s1.charAt(28));
        System.out.println(s1.charAt(48));
    }
}
