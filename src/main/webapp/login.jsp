<pre class="html" name="code"><pre class="html" name="code">
  <%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">

<head>

  <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />

  <title>login</title>

</head>



<body>

<form id="form1" name="form1" method="post" action="checkLogin.jsp">

  <table width="316" border="0" align="center">

    <tr>

      <td colspan="2"><div align="center">登录</div></td>

    </tr>

    <tr>

      <td width="72">帐 号：</td>

      <td width="234"><label>

        <input type="text" name="Username" />

      </label></td>

    </tr>

    <tr>

      <td>密 码:</td>

      <td><label>

        <input type="password" name="Pwd" />

      </label></td>

    </tr>

    <tr>

      <td colspan="2" align="center"><label>



        <input type="submit" name="Submit" value="提交" />

        <input type="reset" name="Submit2" value="重置" />



      </label></td>

    </tr>

  </table>

</form>

</body>

</html>

</pre>
</pre>
