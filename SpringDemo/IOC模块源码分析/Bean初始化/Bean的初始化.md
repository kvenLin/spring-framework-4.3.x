# Bean的初始化
## 前置流程简析
Spring在整个启动流程中,主要分为两个阶段: **容器初始化阶段**和**Bean初始化阶段**
* **容器初始化阶段**: 通过[Resource和ResourceLoader进行资源加载解析](../Resource资源加载/Resource_Learning.md),
然后会根据加载好的Resource资源进行[Bean的解析](../Bean的解析/Bean的解析.md)并将其封装成一个BeanDefinition,
最后将BeanDefinition[注册到BeanDefinitionRegistry](../注册BeanDefinition/注册BeanDefinition.md),至此,IOC完成初始化工作.
## 加载bean阶段
经过容器初始化阶段后,应用程序中定义的bean信息已经全部加载到系统中,而加载bean阶段实际上就是显示或隐式的调用getBean()方法.
> 在这个阶段检查所请求的对象是否已经初始化完成了,如果没有,则会根据注册的bean信息实例化请求的对象,并为其注册依赖,然后返回给请求方.
## getBean()流程分析
主要是通过AbstractBeanFactory的getBean(String name)方法来获取Bean对象:
```java_holder_method_tree
public Object getBean(String name) throws BeansException {
    return doGetBean(name, null, null, false);
}
```
注: getBean()内部调用了**doGetBean()方法**,包括四个参数:
* name: 要获取的bean的名字
* requiredType: 要获取bean的类型
* args: 创建bean时传递的参数.这个参数仅限于创建bean时使用
* typeCheckOnly: 是否为类型检查

doGetBean():参数同上
主要的步骤是:
1.获取beanName,对部分不规则的beanName进行修改得到最终的beanName
2.[从bean的缓存中获取bean](),单例模式的bean在整个过程中只会被创建一次,这里从缓存中得到的bean是原始的bean,并不是最终的bean
3.原型模式与依赖处理: 如果容器中没有对应的BeanDefinition,则会尝试在父类工厂(parentBeanFactory)中加载然后再递归调用getBean()