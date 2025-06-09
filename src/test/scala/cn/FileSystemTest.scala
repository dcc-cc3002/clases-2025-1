package cn

class FileSystemTest extends munit.FunSuite {

  private var emptyFs: Option[FileSystem] = None
  private var fs: Option[FileSystem] = None
  private var d1: Option[Directory] = None
  private var d2: Option[Directory] = None

  override def beforeEach(context: BeforeEach): Unit = {
    emptyFs = Some(new FileSystem())
    d1 = Some(new Directory("d1"))
    d2 = Some(new Directory("d2"))
    d1.get.add(d2.get)
    d1.get.add(new TextFile("file.txt", "hello world!"))
    val c = Array[Byte]('1', 'c')
    d1.get.add(new BinaryFile("file.obj", c))
    fs = Some(new FileSystem())
    fs.get.add(d1.get)

    /** / d1 d2 file.txt file.bin
      */
  }
  test("testGetSize") {
    assertEquals(0, emptyFs.get.getSize())
    assertEquals(14, fs.get.getSize())
  }
  test("testNumberOfFiles") {
    assertEquals(0, emptyFs.get.numberOfFiles())
    assertEquals(2, fs.get.numberOfFiles())
    val file = new TextFile("tmp.txt", "a file system example")
    val d = new Directory("another directory")
    d.add(file)
    fs.get.add(d)
    assertEquals(3, fs.get.numberOfFiles())
  }
  test("testNumberOfDirectories") {
    assertEquals(1, emptyFs.get.numberOfDirectories())
    assertEquals(3, fs.get.numberOfDirectories())
    val file = new TextFile("tmp.txt", "a file system example")
    val d = new Directory("another directory")
    d.add(file)
    fs.get.add(d)
    assertEquals(4, fs.get.numberOfDirectories())
  }
  test("testListing") {
    var result = "root\n"
    assertEquals(result, emptyFs.get.listing())
    result = "root\nd1\nd2\nfile.txt\nfile.obj\n"
    print(fs.get.listing())
    assertEquals(result, fs.get.listing())
  }
  test("testNumberOfTextFiles") {
    assertEquals(0, emptyFs.get.numberOfTextFiles())
    assertEquals(1, fs.get.numberOfTextFiles())
    val file = new TextFile("tmp.txt", "a file system example")
    val d = new Directory("another directory")
    d.add(file)
    fs.get.add(d)
    assertEquals(2, fs.get.numberOfTextFiles())
  }
}
