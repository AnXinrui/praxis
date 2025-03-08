package com.axr.praxis.common;

/**
 * @author xinrui.an
 * @description
 * @date 2025/03/08
 */
public class Constants {
    public static final String DAILY_SENTENCE_TEMPLATE = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>早上好哇～</title>\n" +
            "    <style>\n" +
            "        /* 内联CSS确保邮件客户端兼容性 */\n" +
            "        body {\n" +
            "            margin: 0;\n" +
            "            padding: 20px;\n" +
            "            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, sans-serif;\n" +
            "            background: #f5f5f5;\n" +
            "        }\n" +
            "\n" +
            "        .container {\n" +
            "            max-width: 600px;\n" +
            "            margin: 0 auto;\n" +
            "            border-radius: 15px;\n" +
            "            overflow: hidden;\n" +
            "            position: relative;\n" +
            "            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "\n" +
            "        .background {\n" +
            "            background: linear-gradient(135deg, rgba(255, 182, 193, 0.9) 0%, rgba(147, 197, 253, 0.9) 100%),\n" +
            "            url('https://images.unsplash.com/photo-1497864149936-d3163f0c0f4b?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80');\n" +
            "            background-size: cover;\n" +
            "            background-position: center;\n" +
            "            padding: 40px 25px;\n" +
            "            min-height: 300px;\n" +
            "        }\n" +
            "\n" +
            "        .content {\n" +
            "            color: #1a365d;\n" +
            "            text-align: center;\n" +
            "            position: relative;\n" +
            "            z-index: 2;\n" +
            "        }\n" +
            "\n" +
            "        .quote {\n" +
            "            font-size: 24px;\n" +
            "            line-height: 1.6;\n" +
            "            margin-bottom: 25px;\n" +
            "            font-weight: 600;\n" +
            "            text-shadow: 1px 1px 2px rgba(255, 255, 255, 0.5);\n" +
            "        }\n" +
            "\n" +
            "        .author {\n" +
            "            font-size: 16px;\n" +
            "            color: #4a5568;\n" +
            "            font-style: italic;\n" +
            "        }\n" +
            "\n" +
            "        .badge {\n" +
            "            background: rgba(255, 255, 255, 0.9);\n" +
            "            padding: 12px 25px;\n" +
            "            border-radius: 50px;\n" +
            "            display: inline-block;\n" +
            "            margin-top: 30px;\n" +
            "            font-weight: bold;\n" +
            "            color: #2d3748;\n" +
            "            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "\n" +
            "        @media (max-width: 480px) {\n" +
            "            .quote {\n" +
            "                font-size: 20px;\n" +
            "            }\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"container\">\n" +
            "    <div class=\"background\">\n" +
            "        <div class=\"content\">\n" +
            "            <!-- 每日更换以下内容 -->\n" +
            "            <div class=\"quote\">\n" +
            "                {{content}}\n" +
            "            </div>\n" +
            "            <div class=\"badge\">\n" +
            "                \uD83C\uDF1F 祝您精彩地度过今天\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>";
}
