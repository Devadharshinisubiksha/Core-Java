package ConstructorEx;

		public class ParameterisedConstructor {
			int i;
			ParameterisedConstructor(int i)
			{
				i=1;
			
			System.out.println("Student for playing carrom:" + i);
		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ParameterisedConstructor a=new ParameterisedConstructor(1);
				ParameterisedConstructor b=new ParameterisedConstructor(2);
				ParameterisedConstructor c=new ParameterisedConstructor(3);
				ParameterisedConstructor d=new ParameterisedConstructor(4);
				ParameterisedConstructor e=new ParameterisedConstructor(5);

	}

}
