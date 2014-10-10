import java.util.*;
public class Filter
{
	ArrayList<StudentInfo> studentInfo = new ArrayList<StudentInfo>();
	
	public void add(StudentInfo s){
		studentInfo.add(s);
	}
	public String getName(String id)
	{
		StudentInfo s = null;
		String name = "";
		for(int i = 0;i < studentInfo.size();i++){
			s = studentInfo.get(i);
			name = s.getName(id);
			if(!name.equals("")){
				return name;//如果名字不是空
			}
		}
		return "";
	}
	public static class StudentInfo
	{
		String id = "";
		String name = "";
		public StudentInfo(String id,String name){
			this.id = id;
			this.name = name;
		}
		public String getName(String id){
			if(this.id.equals(id)){
				return name;
			}
			else{
				return "";
			}
		}
	}
}