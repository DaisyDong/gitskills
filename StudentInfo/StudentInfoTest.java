public class StudentInfoTest
{
	public static void main(String[] args){
		Filter f;
		f = new Filter();
		Filter.StudentInfo info2;
		info2 = new Filter.StudentInfo("1120310524","Daisy");
		f.add(info2);
		Filter.StudentInfo info1;
		info1 = new Filter.StudentInfo("1120310523","Dong");
		f.add(info1);
		String name1;
		name1 = f.getName("1120310523");
		String name2;
		name2 = f.getName("1120310524");
		String name3 = f.getName("1");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
	}
}