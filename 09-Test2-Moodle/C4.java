public class C4 {
    private int[] grades;
    
    public C4 (int[] grades){
        this.grades = grades;
    }

    public int[] getGrades(){
        return grades;
    }

    public int m(){
        int[] g = getGrades();
        int max = g[0];
        int min = g[0];
        int sum = 0;
        for (int i=1; i<g.length; i++){
            if (g[i] > max){
                max = g[i];
            }
        }
        for (int j=1; j<g.length; j++){
            if (g[j] < min){
                min = g[j];
            }
        }
        for (int k=0; k<g.length; k++){
            sum = sum + g[k];
        }
        return (sum - max - min);
    }

    public static void main(String[] args){
        int[] o = {4, 5, 3, 3, 5, 2, 2, 4};
        C4 oceny = new C4(o);
        System.out.println(oceny.m());

    }
}
