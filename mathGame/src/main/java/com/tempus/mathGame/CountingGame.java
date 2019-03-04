package com.tempus.mathGame;
/**
 * 数数游戏
 * @author Administrator
 * @descriptionTODO 
 *
 * @version
 * @date 2019年3月4日下午7:44:26
 *
 */
public class CountingGame {
    
	/**
     * 第一阶段游戏
     * @param nums 总数
     * @throws Exception
     */
	public void phase1(int nums) throws Exception{
		if(nums<0){
			throw new Exception("请输入正确的数字");
		}
		
		for(int i=1;i<=nums;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FizzBuzz");
				continue;
			}
			if(i%3==0){
				System.out.println("Fizz");
				continue;
			}
			if(i%5==0){
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	/**
	 * 第二阶段
	 * @param nums 总数
	 * @throws Exception
	 */
	public void phase2(int nums) throws Exception{
		if(nums<0){
			throw new Exception("请输入正确的数字");
		}
		for(int i=1;i<nums;i++){
			boolean flag=false;
			if(i%3==0||(i+"").contains("3")){
				System.out.print("Fizz");
				flag=true;
			}
			if(i%5==0||(i+"").contains("5")){
				System.out.print("Buzz");
				flag=true;
			}
			if(i%3==0||i%5==0||(i+"").contains("3")||(i+"").contains("5")){
				System.out.print("FizzBuzz");
				flag=true;
			}
			if(!flag){
				System.out.println(i);
			}else{
				System.out.println("");
			}
		}
	}
	
	
}
