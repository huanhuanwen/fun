import java.util.StringTokenizer;

/**
 * Created by pc on 2018/1/3.
 */
public class TestStringTokenizer {


    public static void main(String[] args) {
        String s = new String("The=Java=platform=is=the=ideal=platform=for=network=computing");
        StringTokenizer st = new StringTokenizer(s,"=",false);
        System.out.println( "Token Total: " + st.countTokens() );
        while( st.hasMoreElements() ){
            System.out.println( st.nextToken() );
        }
    }
}
/**第一个\t 和左右两个空格 一起 算一个分隔符
  *默认的是：”\t\n\r\f” [\f 是换页]
 *
 */
