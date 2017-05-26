# spring-quartz

>>版本

	Spring 4.2.2 
	
	Quartz Scheduler 2.2.2 
	
	Maven 3
	
	JDK 1.7
	
	Eclipse 


	<!-- Spring整合Quartz进行配置遵循下面的步骤：		 -->

	<!-- 1：定义工作任务的Job							 -->

	<!-- 2：定义触发器Trigger，并将触发器与工作任务绑定	 -->

	<!-- 3：定义调度器，并将Trigger注册到Scheduler		 -->

	1、定义任务的bean ，这里使用MethodInvokingJobDetailFactoryBean, 也可以使用JobDetailFactoryBean ，配置类似


	2、定义触发器的bean，定义一个Simple的Trigger，一个触发器只能和一个任务进行绑定  或者（定义触发器的bean，定义一个Cron的Trigger，一个触发器只能和一个任务进行绑定）


	3、定义调度器，并将Trigger注册到调度器中
