package HackerrankChalleges;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String c = a.toLowerCase();
        String d = b.toLowerCase();
        char[] e = c.toCharArray();
        char[] f = d.toCharArray();

        if(c.length() != d.length()){
            return false;
        }
        String res = " ";
        String res2 = " ";
        for(int i = 0; i < c.length(); i++)
        {
            for(int j = i+1; j<c.length();j++)
            {
                if(e[i]>=e[j])
                {
                    char m = e[i];
                    e[i] = e[j];
                    e[j] = m;
                }
            }
            res = res + e[i];
            //System.out.println(res);
        }
        for(int i = 0; i < c.length(); i++)
        {
            for(int j = i+1; j<c.length();j++)
            {
                if(f[i]>=f[j])
                {
                    char m = f[i];
                    f[i] = f[j];
                    f[j] = m;
                }
            }
            res2 = res2 + f[i];
            //System.out.println(res2);
        }
        char[] x = res.toCharArray();
        char[] y = res2.toCharArray();
        for(int i = 0; i < a.length(); i++)

            if(x[i] != y[i])
            {
                return false;
            }
        return true;

    }

}
