class course   {
    String[] Course = {"java","Python","FullStack","Devops"};
    float[] marks = {88,35,38,66};

  
    void get_course(){
        for(int i=0;i<Course.length;i++){
            
            System.out.println(Course[i]);
        }

    }
    void get_marks(){

        for(int i=0;i<Course.length;i++){
            if(marks[i]<40){
            System.out.println(Course[i] +"="+marks[i]);
        }
    }
}

}
