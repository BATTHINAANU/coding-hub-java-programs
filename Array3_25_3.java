class Array3_25_3
{
	public static void main(String args[])
	{
		byte arrbyte[]=new byte[5];
		short arrshort[]=new short[5];
		int arrint[]=new int[5];
		long arrlong[]=new long[5];
		float arrfloat[]=new float[5];
		double arrdouble[]=new double[5];
		boolean arrboolean[]=new boolean[5];
		String arrstring[]=new String[5];
		char arrchar[]=new char[5];
		System.out.println(arrbyte.getClass()); // o/p:-class [B
		System.out.println(arrshort.getClass());// o/p:-class [S
		System.out.println(arrint.getClass());// o/p:-class [I
		System.out.println(arrlong.getClass());// o/p:-class [J // L is reserved for the reference types that is non premitive types 
		System.out.println(arrfloat.getClass());// o/p:-class [F
		System.out.println(arrdouble.getClass());// o/p:-class [D
		System.out.println(arrboolean.getClass());// o/p:-class [Z //B is  for the byte type
		System.out.println(arrstring.getClass());// o/p:-class [Ljava.lang.String;//L is for non premitive types
		System.out.println(arrchar.getClass()); // o/p:-class [C





	}

}