package ua.lviv.iot.clothesStore.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.clothesStore.model.AbstractClothes;

public class ClothesWriter {

  private Writer csvWriter;

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  public void writeToFile(List<AbstractClothes> clothes) throws IOException {
    for (AbstractClothes clothe : clothes) {
      csvWriter.write(clothe.getHeaders());
      csvWriter.write("\n");
      csvWriter.write(clothe.toCSV());
      csvWriter.write("\n");
      csvWriter.flush();
    }
  }
}