# solr-analyzer-ik

solr | description
---------|------------
 5.4.0+ | supported
##配置
```xml
 <fieldType name="text_ik" class="solr.TextField">
    <analyzer type="index">
      <tokenizer class="org.wltea.analyzer.solr.IKTokenizerFactory" useSmart="false"/>
    </analyzer>
 </fieldType>   
```
