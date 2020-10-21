public class Warning implements Comparable {
  private String warning;
  private Integer level;

  public Warning (String warning, Integer level) {
    warning = warning;
    level = level;
  }

  public String getWarning() {
    return warning;
  }

  public Integer getLevel() {
    return level;
  }

  public int compareTo (Object o) {
    if (o instanceof Warning) {
      return getLevel().compareTo(((Warning)o).getLevel());
    }
    return 1;
  }

  public boolean equals (Object o) {
    if (o == null) {
      return false;
    }
    return getWarning().equals(((Warning)o).getWarning());
  }
}
