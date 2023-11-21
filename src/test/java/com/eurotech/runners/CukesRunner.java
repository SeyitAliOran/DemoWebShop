package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/stepDefinitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}

// dryRun =true'yu kullanarak sadece yeni eklenenin calismasi saglanir.Java code syntaxlerini calistirmaz
// login.feature da tag olarak hangisi ekli ise sadce o calisir
// tags = " @teacher and @smoke" // bu sekilde iki taga sahip senaryolar calisir. TRUE TRUE olmak zorunda
// tags = " @teacher or @smoke" // bu sekilde iki taga sahip senaryolar calisir. Ikisinden birinin true oldugunda calisir
// tags = " @smoke and not @test" // smoke ve test birlikte olan tagi calistirmaz sadece smoke calisir
// tags = " @smoke and not @test and not @teacher" // sadece smoke olan tag calisir
// tags = " @smoke and not @test ór @teacher" // smoke veya teacher olanlar calisir
// bu class sadece testleri calistirmak icin kullanilir
// feature file dan run edilmez
// buraya code yazilmaz
// butun code lar RunWith ile CucumberOptions arasina yazilir
