package runners.basicRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"}, // bu satir ile html,xml,json report olusturabiliyoruz
        features = "src/test/resources/features/uiFeatures",
        glue = "stepDefinitions",
        tags = "@Test1_PozitifSenaryo",
        dryRun =false // step definition olusturmak icin calistirdiginda burayı true yapmayi unutma
)

public class Runner {

    // dryRun=false : yazildiginda belirlenen tag'la etiketlenen tum scenario'lari sirasiyla calistirir
    // dryRun=true :  dedigimizde ise kodlari calistirmadan eksik step defination'lar olup olmadigini kontrol eder
    //                ve varsa bize eksik step defination'lari rapor eder, ve kodlari hic calistirmaz

    // features ve glue olarak spesific bir class veya feature dosyasini degil tum klasor ve package'i
    // sectik. Dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir step definitions varsa rahatlikla kullanabiliriz
}

