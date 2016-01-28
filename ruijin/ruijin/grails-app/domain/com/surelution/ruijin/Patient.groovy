package com.surelution.ruijin


/**
 * 患者类
 * @author admin
 *
 */
class Patient {

    static constraints = {
    }
	
	 String name //患者姓名
	 int age     //年龄
	 Sex sex   //性别
	 
	 enum  Sex{
		 man,woman
		 
		 public String toString() {
			 KeyedMessage.findByKey("Sex-" + name())?.message
		 }
	 }
	 
	 Date dateCreated  
	 Subscriber subscriber //微信用户
}
