package com.brownsuagr.qasystem.utils;

/**
 * 作者：brownSugar
 * 描述：html模版
 */
public class htmlTemplate {

    /**
     * 描述：邮件发送卡片模版
     * @param question
     * @param answer
     * @param keyword
     * @param createdUser
     * @param email
     * @param time
     * @return
     */
    public String mailCardTemplateOne(
            String question ,String answer,String keyword,
            String createdUser ,String email ,String time){
        return  "<html>\n" +
                "<head>\n" +
                "<style type=\"text/css\">\n" +
                "    .card{\n" +
                "        cursor:pointer;\n" +
                "        margin-top:10px;\n" +
                "        box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n" +
                "        \n" +
                "        transition: all 0.25s;}\n" +
                "    .card:hover{\n" +
                "        margin-top:0px;\n" +
                "        box-shadow: 5px 8px 5px #778899;}\n" +
                "    .header{\n" +
                "        background-color: #4caf50;\n" +
                "        color: #fff;\n" +
                "        display:block;\n" +
                "        margin:0 auto;\n" +
                "        padding: 40px;           \n" +
                "    }\n" +
                "    .body{\n" +
                "       padding: 10px;text-align: center;font-size: 20px;\n" +
                "    }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "    <div class=\"card\">\n" +
                "        <div class=\"header\">\n" +
                "            <a >问题: "+ question +"</a>\n" +
                "            <a >答案: "+ answer +"</a>\n" +
                "            <a >关键词: "+ keyword +"</a>\n" +
                "            <a >提交人: "+ createdUser +"</a>\n" +
                "            <a >提交人邮箱: "+ email +"</a>\n" +
                "            <a >提交时间: "+ time +"</a>\n" +
                "        </div>\n" +
                "        <div class=\"body\">\n" +
                "           <p>问题提交</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";
    }

    /**
     * 描述：邮件发送卡片模版
     * @param question
     * @param answer
     * @param keyword
     * @param createdUser
     * @param time
     * @return
     */
    public String mailCardTemplateTwo(
            String question ,String answer,String keyword,
            String createdUser ,String time){
        return  "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>邮件提醒</title>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                "</head>\n" +
                "<body style=\"margin: 0; padding: 0;\">\n" +
                "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"border-collapse: collapse;\">\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div style=\"border: #36649d 1px dashed;margin: 30px;padding: 20px\">\n" +
                "                <label style=\"font-size: 22px;color: #36649d;font-weight: bold\">恭喜您，提交成功！</label>\n" +
                "                <p style=\"font-size: 16px\">尊敬的&nbsp;<label style=\"font-weight: bold\"> "+ createdUser +"先生/女士</label>&nbsp; 您好！欢迎您使用IT&nbsp;Quiz&nbsp;Robot。\n" +
                "                </p>\n" +
                "                <p style=\"font-size: 16px\">问题："+ question +"</p>\n" +
                "                <p style=\"font-size: 16px\">答案："+ answer +"</p>\n" +
                "                <p style=\"font-size: 16px\">关键词："+ keyword +"</p>\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div style=\"margin: 40px\">\n" +
                "                <p style=\"font-size: 16px\">BrownSugar</p>\n" +
                "                <p style=\"color:red;font-size: 14px \">（这是一封自动发送的邮件，请勿回复。）</p>\n" +
                "\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div align=\"right\" style=\"margin: 40px;border-top: solid 1px gray\" id=\"bottomTime\">\n" +
                "                <p style=\"margin-right: 20px\">黑糖个人工作室</p>\n" +
                "                <label style=\"margin-right: 20px\">"+ time +"</label>\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
