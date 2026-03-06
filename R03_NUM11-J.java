int i = 1;
BigDecimal d = new BigDecimal(Double.valueOf(i / 10000.0).toString());
if (d.compareTo(new BigDecimal("0.0001")) == 0) {
  // ...
}
