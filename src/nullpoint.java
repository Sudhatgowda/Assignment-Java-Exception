class NullPointer_Demo
{
    public static void main(String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}

//(if we give null it shows nullpointexception,
// if we give name and change charat 0 to 1r2 it shows the string letter place
//null cannot convert in int