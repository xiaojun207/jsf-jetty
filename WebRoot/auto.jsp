<%@ page contentType="text/html; charset=gb2312" %>

<%
//设置输出信息的格式及字符集 
response.setContentType("text/xml; charset=UTF-8");
response.setHeader("Cache-Control","no-cache");
out.println("<response>"); 

for(int i=0;i<2;i++){
out.println("<name>"+(int)(Math.random()*10)+
   "型笔记本</name>");
out.println("<count>" +(int)(Math.random()*100)+ "</count>");
}
out.println("</response>");
out.close();
%> 
