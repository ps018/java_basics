public class DiagonalStar {
    public static void printSquareStar(int number)
    {
        if(number<5)
        {
            System.out.println("Invalid Value");
        }else
        {
            int rows=0;
            int columns=0;
            for( rows = 1; rows <= number; rows++)
            {
                if(rows==1 || rows==number)
                {
                    int count = 1;
                    while (count <= number) {
                        System.out.print("*");
                        count++;
                    }
                    System.out.println();
                }
                else
                {
                    for(columns = 1; columns <= number; columns++)
                    {
                        if(columns==1 || columns==number)
                        {
                            System.out.print("*");
                        }
                        else if(columns==(number-rows+1))
                        {
                            System.out.print("*");
                        }
                        else if(columns==rows)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

            }
        }
        }
    }

