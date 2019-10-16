package com.dywl.logistics.crm;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.io.File;
import java.nio.file.Paths;

public class CrmShipperCodeGenerator {


  //输出文件目录
  private static String outputDir = System.getProperty("user.dir") + "/crm-model/src/main/java";
  private static String basePath = "com.dywl.logistics.model";

  private static String author = "乔海峰";
  //model name
  private static String modelName = "crm";
  // datasource connect info
  // local
/*  private static String dataSourceUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&serverTimezone=GMT&useSSL=false&characterEncoding=utf8";
  private static String dataSourceUserName = "root";
  private static String dataSourceUserPassword = "root";*/
  //dev
    private static String dataSourceUrl="jdbc:mysql://47.92.66.41:3306/logistics?useUnicode=true&serverTimezone=GMT&useSSL=false&characterEncoding=utf8";
    private static String dataSourceUserName="logistics";
    private static String dataSourceUserPassword="Logistics@2019";
  //要生成的表名 数组
  private static String[] tableNames = {"crm_shipper_contract"};
  //生成实体去掉表前缀
  private static String tablePrefix = "crm";

  private static String entityDir = "entity";
  private static String mapperDir = "mapper";
  private static String serviceDir = "dao";
  private static String serviceImplDir = "dao.impl";
  private static String[] baseDir = {entityDir, mapperDir, serviceDir, serviceImplDir};

  private static boolean isOverEntity = true;
  private static boolean isOverService = true;
  private static boolean isOverServiceImpl = true;
  private static boolean isOverMapper = true;
  private static boolean isOverXml = true;


  public static void main(String[] args) {
    // 代码生成器
    AutoGenerator generator = new AutoGenerator();

    // 全局配置
    GlobalConfig globalConfig = new GlobalConfig();

    globalConfig.setAuthor(author)
        .setOutputDir(outputDir)
        .setBaseResultMap(true)
        .setBaseColumnList(true)
        .setFileOverride(true)
        .setEnableCache(false)
//                .setActiveRecord(true)
        .setOpen(false);
    // XML ResultMap
//                .setBaseResultMap(true)
//                .setServiceName()
//                .setServiceImplName()
    // XML columList;
//                .setBaseColumnList(true);

    globalConfig.setServiceName("I%sDao");
    globalConfig.setServiceImplName("%sDaoImpl");

    generator.setGlobalConfig(globalConfig);


    // 数据源配置
    DataSourceConfig dataSource = new DataSourceConfig();
    dataSource.setUrl(dataSourceUrl)
        .setDriverName("com.mysql.cj.jdbc.Driver")
        .setUsername(dataSourceUserName)
        .setPassword(dataSourceUserPassword);
    generator.setDataSource(dataSource);

    // 包配置
    PackageConfig packageConfig = new PackageConfig();
    packageConfig.setParent(basePath)
        .setService("dao.shipper")
        .setServiceImpl("dao.impl.shipper")
        .setEntity("entity.shipper")
        .setMapper("mapper.shipper")
        .setXml("mapper.xml.shipper")
        .setModuleName(modelName);

    generator.setPackageInfo(packageConfig);

    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    strategy.setNaming(NamingStrategy.underline_to_camel)
        .setColumnNaming(NamingStrategy.underline_to_camel)
        .setEntityLombokModel(true)
        .setInclude(tableNames)
        .setControllerMappingHyphenStyle(false)
        .setRestControllerStyle(false)
        .setEntityColumnConstant(true)
        .setTablePrefix(tablePrefix);

    //strategy.setSuperEntityClass("com.dywl.logi.BaseEntity");
    //要生成的表
    //不需要生成的表名 与 include 只能配置一个
    //strategy.setExclude("");
    //strategy.setSuperControllerClass("com.dywl.logi.BaseController");

    generator.setStrategy(strategy);
    // 选择 freemarker 引擎需要指定
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());.toString()

    generator.setTemplate(initTemplateConfig());

    generator.setTemplateEngine(new FreemarkerTemplateEngine());

    generator.execute();

    //delete controller
    String path=basePath.replaceAll("\\.","\\/");
    File file = new File(outputDir + "/"+path+"/"+modelName+"/controller");
    deleteFile(file);
  }

  /*
   * 如果是文件 ==》直接删除
   * 如果是目录 ==》必须先删除里面每一层目录里的所有文件，最后才能删除外层的目录
   * 原因：不为空的话 删不了
   */
  public static void deleteFile(File file) {
    //判断路径是否存在
    if (file.exists()) {
      //boolean isFile():测试此抽象路径名表示的文件是否是一个标准文件。
      if (file.isFile()) {
        file.delete();
      } else {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
          deleteFile(file2);
        }
      }
      file.delete();
    } else {
      System.out.println("该file路径不存在！！");
    }
  }

  /**
   * 根据自己的需要，修改哪些包下面的 要覆盖还是不覆盖
   */

  private static TemplateConfig initTemplateConfig() {

    String packageName = basePath + "." + modelName;
    TemplateConfig templateConfig = new TemplateConfig();
    for (String dir : baseDir) {
      File file = new File(
          Paths.get(outputDir, String.join("/", packageName.split("\\.")), dir).toString());
      String[] list = file.list();
      if (list != null && list.length > 0) {

        if (!isOverService) {
          templateConfig.setService(null);
        }
        if (!isOverServiceImpl) {
          templateConfig.setServiceImpl(null);
        }
        if (!isOverEntity) {
          templateConfig.setEntity(null);
        }
        if (!isOverMapper) {
          templateConfig.setMapper(null);
        }
        if (!isOverXml) {
          templateConfig.setXml(null);
        }
      }
    }
    return templateConfig;
  }

}
