# MidEng 7.1 Warehouse REST & Dataformats

@author: Sebastian Sailer

@version: 2023-10-03

### Arbeitsschritte & nützliche Info

- [SpringBoot Installation](https://start.spring.io/)

- Gradle installieren mittels "brew install gradle" (unter MacOS)

- Git-Repository clonen

- Main - Ausführen

- Daten erweitern

- Frontend hinzufügen

#### Link-Mapping

```java
@RequestMapping(value="/warehouse/{inID}/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public WarehouseData warehouseData( @PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }
```

Dient in dem fall dazu, wenn man den link "/warehouse/002/data" aufruft, dass man auch zum Produkt mit der Value "002" kommt

---

```bash
gradle clean
```

> **removes the buildDir folder, thus cleaning everything including leftovers from previous builds which are no longer relevant**

---
