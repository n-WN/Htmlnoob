package ChapterII;

public class weight1 {
    public static void main(String[] args) {
        double height=1.72f;
        //身高
        int weight=60;
        //体重
        double BMI=weight/(height*height);
        //BMI=体重/（身高*身高）
        System.out.println("weight:"+60);
        //先在屏幕上打印体重60
        System.out.println("height:"+1.72);
        //在屏幕上打印身高1，72cm
        System.out.println("BMI:"+BMI);
        //在屏幕上打印BMI的值
        System.out.println("weight:");
        //选择打印体重的健康程度
        if (BMI <=18.5) {//选择结构
            System.out.println("weight过轻");
            //如果BMI的值小于等于18.5,体重健康程度为过轻
        }
        if (BMI >18.5&&BMI<=24.9) {
            System.out.println("weight正常");
            //如果BMI的值大于18.5,小于等于24.9，体重健康程度为正常
        }
        if (BMI >24.9 && BMI<29.9) {
            System.out.println("weight过重");
            //如果BMI的值大于24.9 小于29.9,体重健康程度为过重
        }
        if (BMI>=29.9) {
            System.out.println("weight肥胖");
            //如果BMI的值大于等于18.5,体重健康程度为肥胖
        }
    }
}
