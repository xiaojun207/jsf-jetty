<%@ page contentType="text/html; charset=gb2312" %>

<%
//���������Ϣ�ĸ�ʽ���ַ��� 
response.setContentType("text/xml; charset=UTF-8");
response.setHeader("Cache-Control","no-cache");
out.println("<response>"); 

for(int i=0;i<2;i++){
out.println("<name>"+(int)(Math.random()*10)+
   "�ͱʼǱ�</name>");
out.println("<count>" +(int)(Math.random()*100)+ "</count>");
}
out.println("</response>");
out.close();
%> 
