package ua.lviv.iot.clothesStore.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.clothesStore.model.AbstractClothes;
import ua.lviv.iot.clothesStore.writer.ClothesWriter;

class ClothesWriterTest extends BaseClothesManager {

  @Test
  void testClothesWriter() {
    try (Writer csvWriter = new FileWriter(new File("clothes.csv"))) {
      ClothesWriter writer = new ClothesWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(avaialableClothes);
    } catch (Exception e) {
      fail("test failed");
    }
  }

  @Test
  public void testProperTestFormatting() {
    try (Writer csvWriter = new StringWriter()) {

      ClothesWriter writer = new ClothesWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(avaialableClothes);

      String expectedOutput = "";
      for (AbstractClothes clothes : avaialableClothes) {
        expectedOutput += clothes.getHeaders() + "\n" + clothes.toCSV() + "\n";
      }
      assertEquals(expectedOutput, csvWriter.toString());
    } catch (Exception e) {
      fail("the test failed unexpectedly - try to write to the file ...");
    }
  }
} 