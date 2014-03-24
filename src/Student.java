public class Student
{
    // data members
    private String _studentNumber;
    private String _studentName;
    private int _markForMaths;
    private int _markForEnglish;
    private int _markForScience;

    public Student(String studentNumber, String studentName) {
        this._studentNumber = studentNumber;
        this._studentName = studentName;
    }

    // getNumber()
    // return student number
    public String getNumber()
    {
        return this._studentNumber;
    }

    // getName()
    // return student name
    public String getName()
    {
        return this._studentName;
    }

    // entermarks()
    // enter all subject marks given as args
    public void enterMarks(int maths, int english, int science)
    {
        this._markForMaths = maths;
        this._markForEnglish = english;
        this._markForScience = science;
    }

    // getMathsMark()
    // return mark for maths
    public int getMathsMark()
    {
        return this._markForMaths;
    }

    // getEnglishMark()
    // return mark for English
    public int getEnglishMark()
    {
        return this._markForEnglish;
    }

    // getScienceMark()
    // return mark for Science
    public int getScienceMark()
    {
        return this._markForScience;
    }

    // calculateAverageMark()
    // return the average of the three marks
    public double calculateAverageMark()
    {
        return ((this._markForMaths + this._markForEnglish + this._markForScience) / 3.0);
    }
}
