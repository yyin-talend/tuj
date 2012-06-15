package com.talend.tac.cases.commandline;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Commandline {
	protected String server = "localhost";
	protected int port = 8002;
	Socket socket = null;
	StringBuffer sb = new StringBuffer();
	int timeout = 3000;
	PrintWriter pw;
	BufferedReader br;
	
	private static boolean onHudson = false;
	Hashtable properties = new Hashtable();
	/**
	  * ���ݴ�����ļ��е�ַ �������ļ����µ������ļ�����
	  * @Method ReadAllFilesName
	  * @param filePath �ļ��е�ַ
	  * @return LinkedHashMap
	  */
	
	
	 public void delFolder(String folderPath) {
	     try {
	        delAllFile(folderPath); //ɾ����������������
	        String filePath = folderPath;
	        filePath = filePath.toString();
	        java.io.File myFilePath = new java.io.File(filePath);
	        myFilePath.delete(); //ɾ�����ļ���
	        System.err.println("delete successful");
	     } catch (Exception e) {
	       e.printStackTrace(); 
	     }

	     }
	 
   //ɾ��ָ���ļ����������ļ�
   //param path �ļ�����������·��
      public boolean delAllFile(String path) {
          boolean flag = false;
          File file = new File(path);
          if (!file.exists()) {
            return flag;
          }
          if (!file.isDirectory()) {
            return flag;
          }
          String[] tempList = file.list();
          File temp = null;
          for (int i = 0; i < tempList.length; i++) {
             if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
             } else {
                 temp = new File(path + File.separator + tempList[i]);
             }
             if (temp.isFile()) {
                temp.delete();
             }
             if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//��ɾ���ļ���������ļ�
                delFolder(path + "/" + tempList[i]);//��ɾ�����ļ���
                flag = true;
             }
          }
          return flag;
        }
	
	public int randomNum() {
        int[] intRet = new int[6]; 
        int intRd = 0; //��������
        int count = 0; //��¼���ɵ����������
        int flag = 0; //�Ƿ��Ѿ����ɹ���־
        while(count<6){
             Random rdm = new Random(System.currentTimeMillis());
             intRd = Math.abs(rdm.nextInt())%32+1;
             for(int i=0;i<count;i++){
                 if(intRet[i]==intRd){
                     flag = 1;
                     break;
                 }else{
                     flag = 0;
                 }
             }
             if(flag==0){
                 intRet[count] = intRd;
                 count++;
             }
    }
   
    System.out.println("randomNum>>>>>"+intRd);
    return intRd;
  
}
	
	
	
	
	 public static LinkedHashMap ReadAllFilesName(String filePath){
	  LinkedList list=new LinkedList();
	  LinkedHashMap map = new LinkedHashMap();
	  String fileName = "";
	  File tmp;
	   File dir=new File(filePath);
	   File file[]=dir.listFiles();
	   //�����ļ����µ������ļ�
	         for(int i=0;i<file.length;i++){
	          if(file[i].isDirectory()){//������ļ��У��ݷż�����ȥ
	            list.add(file[i]);
	          }else{
	          // System.out.println(file[i].getAbsolutePath());
	         fileName = file[i].getName();
	            map.put(fileName+i,fileName);
	          }//end if
	     }//end for
	        //��ʼѭ���������μ��ļ����µ������ļ�
	         while(!list.isEmpty()){
	           tmp=(File)list.removeFirst();
	           if(tmp.isDirectory()){
	              file=tmp.listFiles();
	              if(file==null) continue;
	                for(int i=0;i<file.length;i++){
	                   if(file[i].isDirectory()){
	                      list.add(file[i]);
	                   }else{
	                   // System.out.println(file[i].getAbsolutePath());
	                   fileName = file[i].getName();
	                      map.put(fileName+i,fileName);
	                   }//end if
	                }//end for
	             }else{
	              fileName = tmp.getName();
	                 map.put(fileName,fileName);
	             } 
	         }//end while
	  return map;
	 }
	 
	 
	  public LinkedHashMap getFileNameList(String path) {
	   String filePath = path;
	   LinkedHashMap map = this.ReadAllFilesName(filePath);
//	   String out = "";
//	   for(Iterator keyItr = map.keySet().iterator();keyItr.hasNext();){
//	        Object i  =  keyItr.next();
//	           out = (String)map.get(i);
//	           System.out.println(out);
//	   }
	   
	   return map;
	   
	 }
	
	public boolean isOnHudson(){
		String testsOnHudson = System.getProperty("tests.on.hudson");
		if(testsOnHudson != null && !"".equals(testsOnHudson.trim())) {
			onHudson = true;
		}
		return onHudson;
	}
	
	/**
	 * get the Uniform Resource Locator of the filePath
	 * @param filePath
	 * @return
	 */
	public URL getfileURL(String filePath){
		URL fileUrl = null;
//		String onHudson = System.getProperty("tests.on.hudson");
		try {
			if(this.isOnHudson()) {
				fileUrl = new File(System.getProperty("selenium.target.src") + File.separator + filePath).toURL();
			} else {
				fileUrl = TestCommandline.class.getClassLoader().getResource(filePath);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("URL -- " + fileUrl);
		return fileUrl;
	}
	
	/**
	 * @param filePath
	 * @return
	 */
	public String parseRelativePath(String filePath){
		System.out.println("path before:     "+filePath);
		System.out.println("path after:     "+getfileURL(filePath).toString());
		return this.getfileURL(filePath).toString();
	}
	
	/**
	 * get absolute path of the filePath
	 * @param filePath
	 * @return
	 */
	public String getAbsolutePath(String filePath) {
		return this.getfileURL(filePath).getPath();
	}
	

	public int getCommandId(String commandResultInfo) {
		
		String[] ss = commandResultInfo.split("ADDED_COMMAND");
		System.err.println(">>>>>>>>>"+ss[1]);
		int commandId = Integer.valueOf(ss[1].trim()).intValue();
		return commandId;
		
	}
	
	
	public Commandline() {
		if(System.getProperty("commandline.server")!=null)
			this.server = System.getProperty("commandline.server");
		
		if(System.getProperty("commandline.port")!=null)
			this.port = Integer.parseInt(System.getProperty("commandline.port"));
	}
	
	public Commandline(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	public void init(String server, int port, int timeout) throws UnknownHostException, IOException{
		socket = new Socket(server, port);
		socket.setSoTimeout(timeout);
        boolean autoflush = false;
        pw = new PrintWriter(socket.getOutputStream(),autoflush);
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	public void closeConnection() throws IOException{
		pw.close();
		br.close();
		socket.close();
	}
	
	public String command(String server, int port, int timeout, String command) {
		String result = null;
		try {
			this.init(server, port, timeout);
            pw.println(command);
            pw.flush();
			result = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sb.append(result);
		System.out.println("- " + result);
		return result;
	}

	public String command(String command) {
		return this.command(server, port, timeout, command);
	}

	public List<String> command(String server, int port, int timeout, String command, String end) {
		List<String> results = new ArrayList<String>();
		String result = null;
		try {
			socket = new Socket(server, port);
			socket.setSoTimeout(timeout);
            boolean autoflush = false;
            pw = new PrintWriter(socket.getOutputStream(),autoflush);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
            pw.println(command);
            pw.flush();
			
			result = br.readLine();
			
			sb.append(result);
			results.add(result);
			
			while(!"".equals(result) && null!=result && !"\n".equals(result)){
				result = br.readLine();
//				System.out.println("==== " + result);
				sb.append(result.trim() + "\n");
				results.add(result);
				if(result.toLowerCase().contains(end)){
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				this.closeConnection();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return results;
	}
	
	public List<String> command(String command, String end) {
		return this.command(server, port, timeout, command, end);
	}
}