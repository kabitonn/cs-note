<!-- GFM-TOC -->
* [开发效率](#开发效率)
  * [常用插件](#常用插件)
* [问题及配置](#问题及配置)
  * [常见配置](#常见配置)
    * [自动导入引用类所在包配置](#自动导入引用类所在包配置)
    * [文件模板配置](#文件模板配置)
    * [leetcode 插件配置](#leetcode-插件配置)
  * [常见问题](#常见问题)
    * [编译器语言版本](#编译器语言版本)
    * [MapStruct 注解不识别](#MapStruct-注解不识别)
<!-- GFM-TOC -->



# 开发效率

## 常用插件

- Alibaba Java Coding Guidelines
- Free Mybatis plugin
- Git ToolBox
- JSON Parser
- Key Promoter
- leetcode editor
- Lombok
- MapStruct Support
- Maven Helper
- PlantUML
- Rainbow Brackets
- RestfulTookit
- CodeGlance

# 问题及配置

## 常见配置

### 自动导入引用类所在包配置

Editor -> General -> Auto Import 

### 文件模板配置

Editor -> File and Code Templates

Class的Java Doc文件注释

```java
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
/**
 * @description：TODO
 * @author     ：chenwei.tjw
 * @date       ：${DATE} ${TIME}
 */
public class ${NAME} {
}
```

### leetcode 插件配置
LeetCode editor 配置

CodeFileName:
```java
P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})`
```

Codetemplate:
```java
${question.content}

//Java：${question.title}

package autumn.leetcode.editor.cn;

public class P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
        Solution solution = new P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        // TO TEST
    }
    ${question.code}
}
```

## 常见问题

### 编译器语言版本

- Build -> Compiler -> Java Compiler
- Project Structure

### MapStruct 注解不识别

Build -> Compiler -> Annotation Processors

