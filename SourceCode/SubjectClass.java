class Subject{

    public String subjectName;
    public int subjectCode;
    public String[] preSubName;

    public Subject()
    {
        subjectName = "";
        subjectCode = -1;
        preSubName = new String[0];
    }

    public Subject(String subjectName, int subjectCode, String preSubName[]){
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.preSubName = preSubName;
    }

    public boolean IsPossibleTakeClass(String[] preSubName)
    {
        int count = 0;

        for(int i=0; i < preSubName.length; ++i)
        {
            for(int j=0; j < this.preSubName.length; ++j)
            {
                if(preSubName[i].equals(this.preSubName[j]))
                {
                    ++count;
                }
            }
        }

        if(count == this.preSubName.length)
        {
            return true;
        }
        else
            return false;
    }
}

public class SubjectClass {
    public void main(String[] args){
        Subject java = new Subject("Java", 466703, new String[]{"c", "c++"});

        if(java.IsPossibleTakeClass(new String[]{"c", "c++"})){
            System.out.println("과목 수강 가능");
        }
        else{
            System.out.println("과목 수강 불가능");
        }

    }
}
