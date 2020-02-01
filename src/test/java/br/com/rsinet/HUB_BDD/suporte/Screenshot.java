package br.com.rsinet.HUB_BDD.suporte;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;

public class Screenshot {

	public void gerarScreenShot(WebDriver driver, Scenario scenario) {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(System.getProperty("user.dir") + "/target/screenshot/" + screenshotName
					+ Generator.dataHoraParaArquivo() + ".png");
			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("erro ao copiar arquivo para a pasta " + e.getMessage());
		}
	}

}
