package projecct.text;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Test {

	/*
	 * public static void main(String[] args) { List<Integer> list = new
	 * ArrayList<Integer>(); list.add(2); list.add(3); list.add(4); list.add(5);
	 * list.add(6); list.add(7); list.add(8); Iterator<Integer> iterator =
	 * list.iterator(); while(iterator.hasNext()) { Integer next = iterator.next();
	 * if(next == 3 || next == 4 || next == 5) { iterator.remove(); } } for (int i =
	 * 0; i < list.size(); i++) { System.out.println(list.get(i)); } }
	 */

	private DoSomeThing doSomeThing = new DoSomeThing();

	@Annotations
	public void test() {
		doSomeThing.test();
	}

	public static void main(String[] args) throws ParseException, UnsupportedEncodingException {
		/*
		 * Calendar instance = Calendar.getInstance();
		 * System.out.println(instance.getTime());
		 */

		/*
		 * List<Integer> list = new ArrayList(); list.add(1); list.add(2);
		 * Iterator<Integer> iterator = list.iterator(); while (iterator.hasNext()) {
		 * Integer next = iterator.next(); if (next.toString().equals("1")) {
		 * list.remove(next); } } System.out.println(list.size());
		 */

		/*
		 * Map map = new HashMap(); JSONObject jsonObject = new JSONObject();
		 */
		/*
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		 * SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd"); Date
		 * date = new Date(); String format = simpleDateFormat.format(date);
		 * System.out.println(format);
		 */
		
		//simpleDateFormat2.format(simpleDateFormat.parse("2020/02/29"));
		//System.out.println(simpleDateFormat.format(simpleDateFormat2.parse("2020/02/29")));
		/*
		 * long time = date.getTime() - 24 * 3600 * 1000; Date date1 = new Date(time);
		 * System.out.println(simpleDateFormat.format(date1));
		 */

		// String str = "3.12";
		// System.out.println((double)2/3);
		
		/*
		 * BigDecimal bigDecimal = new BigDecimal("100").setScale(2);
		 * System.out.println(bigDecimal);
		 */
		
		
		String jsapi_ticket = "sM4AOVdWfPE4DxkXGEs8VMCPGGVi4C3VM0P37wVUCFvkVAy_90u5h9nbSlYy3-Sl-HhTdfl2fzFy1AOcHKP7qg";

        // 注意 URL 一定要动态获取，不能 hardcode
        String url = "http://mp.weixin.qq.com?params=value";
        Map<String, String> ret = sign(jsapi_ticket, url);
        for (Map.Entry<String,String> entry : ret.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }


	}
	
	public static Map<String, String> sign(String jsapi_ticket, String url) throws UnsupportedEncodingException {
        Map<String, String> ret = new HashMap<String, String>();
        String nonce_str = create_nonce_str();
        String timestamp = create_timestamp();
        String string1;
        String signature = "";

        //注意这里参数名必须全部小写，且必须有序
        string1 = "jsapi_ticket=" + jsapi_ticket +
                  "&noncestr=" + nonce_str +
                  "&timestamp=" + timestamp +
                  "&url=" + url;
        System.out.println( );

        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);

        return ret;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    private static String create_nonce_str() {
        //return UUID.randomUUID().toString();
        return "Wm3WZYTPz0wzccnW";
    }

    private static String create_timestamp() {
        //return Long.toString(System.currentTimeMillis() / 1000);
        return "1414587457";
    }


}
