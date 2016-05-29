<pre class="html" name="code"><%@ page import="java.io.*" %>
  <%@ page import="java.util.*" %>
  <%@ page import="java.sql.*" %>
  <%@ page contentType="text/html; charset=UTF-8" %>
  <html>
<head>
    <title>DB operation</title>
</head>
<body>
<%
    String username = request.getParameter("Username");
    String pwd = request.getParameter("Pwd");
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=UTF-8";
        String dbUser = "root";
        String dbPwd = "123456";
        String sql = "select * from  t_demo_user where FName='" + username + "'";
        con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        out.print("已连接。。。。。");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql); //执行查询
        if (rs.next())
        {
            response.sendRedirect("index.jsp");
        } else
        {
            response.sendRedirect("login.jsp");
        }
        stmt.close();
        con.close();
    } catch (Exception ex)
    {
        out.print("连接失败！！<br>" + ex.toString());
    }
%>

</body>

</html></pre>  