public class SampleClass {


    public static void main(String[] args) {

        String name = "God is good";
        String guy = " ";
        String sampleString = name.split(guy)[0];
        String test = sampleString.replaceAll("o","/");
        System.out.println(sampleString);
        System.out.println(test);
    }
}
