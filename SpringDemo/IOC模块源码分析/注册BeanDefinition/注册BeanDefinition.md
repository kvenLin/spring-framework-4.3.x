# 注册BeanDefinition
在[获取Document对象](../获取Document对象/获取Document实例.md)之后:
* 会根据获取的资源对象调用registerBeanDefinitions()方法进行Bean的注册
## 核心方法
```java_holder_method_tree
    public int registerBeanDefinitions(Document doc, Resource resource) throws BeanDefinitionStoreException {
		//1.实例出一个BeanDefinitionDocumentReader对象,实际是继承BeanDefinitionDocumentReader接口的DefaultBeanDefinitionDocumentReader
		BeanDefinitionDocumentReader documentReader = createBeanDefinitionDocumentReader();
		//2.统计BeanDefinition的个数
		int countBefore = getRegistry().getBeanDefinitionCount();
		//3.注册BeanDefinition
		documentReader.registerBeanDefinitions(doc, createReaderContext(resource));
		//4.返回新注册的BeanDefinition个数
		return getRegistry().getBeanDefinitionCount() - countBefore;
	}
```
* 步骤1中BeanDefinitionDocumentReader是一个接口,默认实现类是DefaultBeanDefinitionDocumentReader
* 而实际在步骤3中调用的是:DefaultBeanDefinitionDocumentReader.registerBeanDefinitions()方法
    * 该方法内部真正使用的**doRegisterBeanDefinitions()来完成注册功能**,包括三步:
        1. 解析前处理:preProcessXml(root);
        2. [解析:parseBeanDefinitions(root, this.delegate)](../Bean的解析/Bean的解析.md);
        3. 解析后处理:postProcessXml(root);
