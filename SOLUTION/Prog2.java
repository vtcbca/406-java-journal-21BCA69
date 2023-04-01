class FloyedTriangle

{
    public static void main (String args[])
    {
        int no,k=1;

        no=Integer.parseInt(args[0]);
      
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<i;j++,k++)
            {
            System.out.print(k);
            }
            System.out.println();
        }
        
    }
}
