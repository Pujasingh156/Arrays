package Array;

public class TwoDStringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] stArr = {
                {"Amit", "Raj", "Neha", "Kavita", "Rahul"},
                {"Sita", "Vijay", "Priya", "Anil", "Pooja"},
                {"Ravi", "Meena", "Kiran", "Anita", "Arjun"}
        };


        int row = stArr.length;
        int col = stArr[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    


	}

}
