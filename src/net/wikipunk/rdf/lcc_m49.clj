(ns net.wikipunk.rdf.lcc-m49
  "United Nations Standard Country or Area Codes for Statistical Use (M49 Geographic Region Codes) Ontology"
  {:dcterms/issued #inst "2021-11-07T23:48:51.125-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "lcc-m49" "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-m49",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label
   "United Nations Standard Country or Area Codes for Statistical Use (M49 Geographic Region Codes) Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/Countries/AboutCountries/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"],
   :skos/changeNote
   ["The https://www.omg.org/spec/LCC/20190201/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 RTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."
    "The https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect changed URI for North Macedonia (code MK) made by the LCC 1.2 RTF."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2021 agnos.ai UK Ltd."
                  "Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2015-2020 Adaptive Inc."
                  "Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :sm/fileAbbreviation "lcc-m49",
   :sm/fileAbstract
   "This ontology represents the United Nations publication 'Standard Country or Area Codes for Statistical Use' originally published as Series M, No. 49 and now commonly referred to as the M49 standard. The assignment of countries or areas to specific groupings is for statistical convenience and does not imply any assumption regarding political or other affiliation of countries or territories by the United Nations. The codes included herein are current as of the version IRI for this ontology.",
   :sm/filename "UN-M49-RegionCodes.rdf"})

(def Africa
  "individual representing the continent Africa"
  {:db/ident :lcc-m49/Africa,
   :lcc-cr/hasEnglishShortName "Africa",
   :lcc-cr/hasNumericRegionCode "002",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Africa",
   :skos/definition "individual representing the continent Africa"})

(def Americas
  "individual representing the continent Americas"
  {:db/ident :lcc-m49/Americas,
   :lcc-cr/hasEnglishShortName "Americas",
   :lcc-cr/hasNumericRegionCode "019",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Americas",
   :skos/definition "individual representing the continent Americas"})

(def Asia
  "individual representing the continent Asia"
  {:db/ident :lcc-m49/Asia,
   :lcc-cr/hasEnglishShortName "Asia",
   :lcc-cr/hasNumericRegionCode "142",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Asia",
   :skos/definition "individual representing the continent Asia"})

(def AustraliaAndNewZealand
  "individual representing the region Australia and New Zealand"
  {:db/ident :lcc-m49/AustraliaAndNewZealand,
   :lcc-cr/hasEnglishShortName "Australia and New Zealand",
   :lcc-cr/hasNumericRegionCode "053",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Australia and New Zealand",
   :skos/definition
   "individual representing the region Australia and New Zealand"})

(def Caribbean
  "individual representing the subregion Caribbean"
  {:db/ident :lcc-m49/Caribbean,
   :lcc-cr/hasEnglishShortName "Caribbean",
   :lcc-cr/hasNumericRegionCode "029",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Caribbean",
   :skos/definition "individual representing the subregion Caribbean"})

(def CentralAmerica
  "individual representing the subregion Central America"
  {:db/ident :lcc-m49/CentralAmerica,
   :lcc-cr/hasEnglishShortName "Central America",
   :lcc-cr/hasNumericRegionCode "013",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Central America",
   :skos/definition "individual representing the subregion Central America"})

(def CentralAsia
  "individual representing the region Central Asia"
  {:db/ident :lcc-m49/CentralAsia,
   :lcc-cr/hasEnglishShortName "Central Asia",
   :lcc-cr/hasNumericRegionCode "143",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Central Asia",
   :skos/definition "individual representing the region Central Asia"})

(def ChannelIslands
  "individual representing the subregion Channel Islands"
  {:db/ident :lcc-m49/ChannelIslands,
   :lcc-cr/hasEnglishShortName "Channel Islands",
   :lcc-cr/hasNumericRegionCode "830",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Channel Islands",
   :skos/definition "individual representing the subregion Channel Islands"})

(def Continent
  "the kind of region that is a continent"
  {:db/ident :lcc-m49/Continent,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "continent",
   :skos/definition "the kind of region that is a continent"})

(def EasternAfrica
  "individual representing the subregion Eastern Africa"
  {:db/ident :lcc-m49/EasternAfrica,
   :lcc-cr/hasEnglishShortName "Eastern Africa",
   :lcc-cr/hasNumericRegionCode "014",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Africa",
   :skos/definition "individual representing the subregion Eastern Africa"})

(def EasternAsia
  "individual representing the region Eastern Asia"
  {:db/ident :lcc-m49/EasternAsia,
   :lcc-cr/hasEnglishShortName "Eastern Asia",
   :lcc-cr/hasNumericRegionCode "030",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Asia",
   :skos/definition "individual representing the region Eastern Asia"})

(def EasternEurope
  "individual representing the region Eastern Europe"
  {:db/ident :lcc-m49/EasternEurope,
   :lcc-cr/hasEnglishShortName "Eastern Europe",
   :lcc-cr/hasNumericRegionCode "151",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Europe",
   :skos/definition "individual representing the region Eastern Europe"})

(def Europe
  "individual representing the continent Europe"
  {:db/ident :lcc-m49/Europe,
   :lcc-cr/hasEnglishShortName "Europe",
   :lcc-cr/hasNumericRegionCode "150",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Europe",
   :skos/definition "individual representing the continent Europe"})

(def LatinAmericaAndTheCaribbean
  "individual representing the region Latin America and the Caribbean"
  {:db/ident :lcc-m49/LatinAmericaAndTheCaribbean,
   :lcc-cr/hasEnglishShortName "Latin America and the Caribbean",
   :lcc-cr/hasNumericRegionCode "419",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Latin America and the Caribbean",
   :skos/definition
   "individual representing the region Latin America and the Caribbean"})

(def Melanesia
  "individual representing the region Melanesia"
  {:db/ident :lcc-m49/Melanesia,
   :lcc-cr/hasEnglishShortName "Melanesia",
   :lcc-cr/hasNumericRegionCode "054",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Melanesia",
   :skos/definition "individual representing the region Melanesia"})

(def Micronesia
  "individual representing the region Micronesia"
  {:db/ident :lcc-m49/Micronesia,
   :lcc-cr/hasEnglishShortName "Micronesia",
   :lcc-cr/hasNumericRegionCode "057",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Micronesia",
   :skos/definition "individual representing the region Micronesia"})

(def MiddleAfrica
  "individual representing the subregion Middle Africa"
  {:db/ident :lcc-m49/MiddleAfrica,
   :lcc-cr/hasEnglishShortName "Middle Africa",
   :lcc-cr/hasNumericRegionCode "017",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Middle Africa",
   :skos/definition "individual representing the subregion Middle Africa"})

(def NorthernAfrica
  "individual representing the region Northern Africa"
  {:db/ident :lcc-m49/NorthernAfrica,
   :lcc-cr/hasEnglishShortName "Northern Africa",
   :lcc-cr/hasNumericRegionCode "015",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern Africa",
   :skos/definition "individual representing the region Northern Africa"})

(def NorthernAmerica
  "individual representing the region Northern America"
  {:db/ident :lcc-m49/NorthernAmerica,
   :lcc-cr/hasEnglishShortName "Northern America",
   :lcc-cr/hasNumericRegionCode "021",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern America",
   :skos/definition "individual representing the region Northern America"})

(def NorthernEurope
  "individual representing the region Northern Europe"
  {:db/ident :lcc-m49/NorthernEurope,
   :lcc-cr/hasEnglishShortName "Northern Europe",
   :lcc-cr/hasNumericRegionCode "154",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern Europe",
   :skos/definition "individual representing the region Northern Europe"})

(def Oceania
  "individual representing the continent Oceania"
  {:db/ident :lcc-m49/Oceania,
   :lcc-cr/hasEnglishShortName "Oceania",
   :lcc-cr/hasNumericRegionCode "009",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Oceania",
   :skos/definition "individual representing the continent Oceania"})

(def Planet
  "the kind of region that is a planet"
  {:db/ident :lcc-m49/Planet,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "planet",
   :skos/definition "the kind of region that is a planet"})

(def Polynesia
  "individual representing the region Polynesia"
  {:db/ident :lcc-m49/Polynesia,
   :lcc-cr/hasEnglishShortName "Polynesia",
   :lcc-cr/hasNumericRegionCode "061",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Polynesia",
   :skos/definition "individual representing the region Polynesia"})

(def Region
  "the kind of region that is a region within a continent"
  {:db/ident :lcc-m49/Region,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "region",
   :skos/definition "the kind of region that is a region within a continent"})

(def South-easternAsia
  "individual representing the region South-eastern Asia"
  {:db/ident :lcc-m49/South-easternAsia,
   :lcc-cr/hasEnglishShortName "South-eastern Asia",
   :lcc-cr/hasNumericRegionCode "035",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "South-eastern Asia",
   :skos/definition "individual representing the region South-eastern Asia"})

(def SouthAmerica
  "individual representing the subregion South America"
  {:db/ident :lcc-m49/SouthAmerica,
   :lcc-cr/hasEnglishShortName "South America",
   :lcc-cr/hasNumericRegionCode "005",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "South America",
   :skos/definition "individual representing the subregion South America"})

(def SouthernAfrica
  "individual representing the subregion Southern Africa"
  {:db/ident :lcc-m49/SouthernAfrica,
   :lcc-cr/hasEnglishShortName "Southern Africa",
   :lcc-cr/hasNumericRegionCode "018",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Africa",
   :skos/definition "individual representing the subregion Southern Africa"})

(def SouthernAsia
  "individual representing the region Southern Asia"
  {:db/ident :lcc-m49/SouthernAsia,
   :lcc-cr/hasEnglishShortName "Southern Asia",
   :lcc-cr/hasNumericRegionCode "034",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Asia",
   :skos/definition "individual representing the region Southern Asia"})

(def SouthernEurope
  "individual representing the region Southern Europe"
  {:db/ident :lcc-m49/SouthernEurope,
   :lcc-cr/hasEnglishShortName "Southern Europe",
   :lcc-cr/hasNumericRegionCode "039",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Europe",
   :skos/definition "individual representing the region Southern Europe"})

(def Sub-SaharanAfrica
  "individual representing the region Sub-Saharan Africa"
  {:db/ident :lcc-m49/Sub-SaharanAfrica,
   :lcc-cr/hasEnglishShortName "Sub-Saharan Africa",
   :lcc-cr/hasNumericRegionCode "202",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Sub-Saharan Africa",
   :skos/definition "individual representing the region Sub-Saharan Africa"})

(def Subregion
  "the kind of region that is a subregion"
  {:db/ident :lcc-m49/Subregion,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "subregion",
   :skos/definition "the kind of region that is a subregion"})

(def WesternAfrica
  "individual representing the subregion Western Africa"
  {:db/ident :lcc-m49/WesternAfrica,
   :lcc-cr/hasEnglishShortName "Western Africa",
   :lcc-cr/hasNumericRegionCode "011",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Africa",
   :skos/definition "individual representing the subregion Western Africa"})

(def WesternAsia
  "individual representing the region Western Asia"
  {:db/ident :lcc-m49/WesternAsia,
   :lcc-cr/hasEnglishShortName "Western Asia",
   :lcc-cr/hasNumericRegionCode "145",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Asia",
   :skos/definition "individual representing the region Western Asia"})

(def WesternEurope
  "individual representing the region Western Europe"
  {:db/ident :lcc-m49/WesternEurope,
   :lcc-cr/hasEnglishShortName "Western Europe",
   :lcc-cr/hasNumericRegionCode "155",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Europe",
   :skos/definition "individual representing the region Western Europe"})

(def World
  "individual representing the planet World"
  {:db/ident :lcc-m49/World,
   :lcc-cr/hasEnglishShortName "",
   :lcc-cr/hasNumericRegionCode "001",
   :lcc-cr/isClassifiedBy :lcc-m49/Planet,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "World",
   :skos/definition "individual representing the planet World"})

(def ^{:private true} Afghanistan
  {:db/ident :lcc-3166-1/Afghanistan,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} AlandIslands
  {:db/ident :lcc-3166-1/AlandIslands,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Albania
  {:db/ident :lcc-3166-1/Albania,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Algeria
  {:db/ident :lcc-3166-1/Algeria,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} AmericanSamoa
  {:db/ident :lcc-3166-1/AmericanSamoa,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} Andorra
  {:db/ident :lcc-3166-1/Andorra,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Angola
  {:db/ident :lcc-3166-1/Angola,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Anguilla
  {:db/ident :lcc-3166-1/Anguilla,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Antarctica
  {:db/ident :lcc-3166-1/Antarctica,
   :lcc-cr/isSubregionOf :lcc-m49/World})

(def ^{:private true} AntiguaAndBarbuda
  {:db/ident :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Argentina
  {:db/ident :lcc-3166-1/Argentina,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Armenia
  {:db/ident :lcc-3166-1/Armenia,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Aruba
  {:db/ident :lcc-3166-1/Aruba,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Australia
  {:db/ident :lcc-3166-1/Australia,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} Austria
  {:db/ident :lcc-3166-1/Austria,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Azerbaijan
  {:db/ident :lcc-3166-1/Azerbaijan,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Bahamas
  {:db/ident :lcc-3166-1/Bahamas,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Bahrain
  {:db/ident :lcc-3166-1/Bahrain,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Bangladesh
  {:db/ident :lcc-3166-1/Bangladesh,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Barbados
  {:db/ident :lcc-3166-1/Barbados,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Belarus
  {:db/ident :lcc-3166-1/Belarus,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Belgium
  {:db/ident :lcc-3166-1/Belgium,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Belize
  {:db/ident :lcc-3166-1/Belize,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} Benin
  {:db/ident :lcc-3166-1/Benin,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Bermuda
  {:db/ident :lcc-3166-1/Bermuda,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAmerica})

(def ^{:private true} Bhutan
  {:db/ident :lcc-3166-1/Bhutan,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Bolivia
  {:db/ident :lcc-3166-1/Bolivia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Bonaire
  {:db/ident :lcc-3166-1/Bonaire,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} BosniaAndHerzegovina
  {:db/ident :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Botswana
  {:db/ident :lcc-3166-1/Botswana,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAfrica})

(def ^{:private true} BouvetIsland
  {:db/ident :lcc-3166-1/BouvetIsland,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Brazil
  {:db/ident :lcc-3166-1/Brazil,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} BritishIndianOceanTerritory
  {:db/ident :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} BruneiDarussalam
  {:db/ident :lcc-3166-1/BruneiDarussalam,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Bulgaria
  {:db/ident :lcc-3166-1/Bulgaria,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} BurkinaFaso
  {:db/ident :lcc-3166-1/BurkinaFaso,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Burundi
  {:db/ident :lcc-3166-1/Burundi,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} CaboVerde
  {:db/ident :lcc-3166-1/CaboVerde,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Cambodia
  {:db/ident :lcc-3166-1/Cambodia,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Cameroon
  {:db/ident :lcc-3166-1/Cameroon,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Canada
  {:db/ident :lcc-3166-1/Canada,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAmerica})

(def ^{:private true} CaymanIslands
  {:db/ident :lcc-3166-1/CaymanIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} CentralAfricanRepublic
  {:db/ident :lcc-3166-1/CentralAfricanRepublic,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Chad
  {:db/ident :lcc-3166-1/Chad,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Chile
  {:db/ident :lcc-3166-1/Chile,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} China
  {:db/ident :lcc-3166-1/China,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} ChristmasIsland
  {:db/ident :lcc-3166-1/ChristmasIsland,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} CocosKeelingIslands
  {:db/ident :lcc-3166-1/CocosKeelingIslands,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} Colombia
  {:db/ident :lcc-3166-1/Colombia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Comoros
  {:db/ident :lcc-3166-1/Comoros,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Congo
  {:db/ident :lcc-3166-1/Congo,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} CongoDemocraticRepublicOf
  {:db/ident :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} CookIslands
  {:db/ident :lcc-3166-1/CookIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} CostaRica
  {:db/ident :lcc-3166-1/CostaRica,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} CoteDIvoire
  {:db/ident :lcc-3166-1/CoteDIvoire,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Croatia
  {:db/ident :lcc-3166-1/Croatia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Cuba
  {:db/ident :lcc-3166-1/Cuba,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Curacao
  {:db/ident :lcc-3166-1/Curacao,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Cyprus
  {:db/ident :lcc-3166-1/Cyprus,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Czechia
  {:db/ident :lcc-3166-1/Czechia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Denmark
  {:db/ident :lcc-3166-1/Denmark,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Djibouti
  {:db/ident :lcc-3166-1/Djibouti,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Dominica
  {:db/ident :lcc-3166-1/Dominica,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} DominicanRepublic
  {:db/ident :lcc-3166-1/DominicanRepublic,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Ecuador
  {:db/ident :lcc-3166-1/Ecuador,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Egypt
  {:db/ident :lcc-3166-1/Egypt,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} ElSalvador
  {:db/ident :lcc-3166-1/ElSalvador,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} EquatorialGuinea
  {:db/ident :lcc-3166-1/EquatorialGuinea,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Eritrea
  {:db/ident :lcc-3166-1/Eritrea,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Estonia
  {:db/ident :lcc-3166-1/Estonia,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Eswatini
  {:db/ident :lcc-3166-1/Eswatini,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAfrica})

(def ^{:private true} Ethiopia
  {:db/ident :lcc-3166-1/Ethiopia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} FalklandIslands
  {:db/ident :lcc-3166-1/FalklandIslands,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} FaroeIslands
  {:db/ident :lcc-3166-1/FaroeIslands,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Fiji
  {:db/ident :lcc-3166-1/Fiji,
   :lcc-cr/isSubregionOf :lcc-m49/Melanesia})

(def ^{:private true} Finland
  {:db/ident :lcc-3166-1/Finland,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} France
  {:db/ident :lcc-3166-1/France,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} FrenchGuiana
  {:db/ident :lcc-3166-1/FrenchGuiana,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} FrenchPolynesia
  {:db/ident :lcc-3166-1/FrenchPolynesia,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} FrenchSouthernTerritories
  {:db/ident :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Gabon
  {:db/ident :lcc-3166-1/Gabon,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} Gambia
  {:db/ident :lcc-3166-1/Gambia,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Georgia
  {:db/ident :lcc-3166-1/Georgia,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Germany
  {:db/ident :lcc-3166-1/Germany,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Ghana
  {:db/ident :lcc-3166-1/Ghana,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Gibraltar
  {:db/ident :lcc-3166-1/Gibraltar,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Greece
  {:db/ident :lcc-3166-1/Greece,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Greenland
  {:db/ident :lcc-3166-1/Greenland,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAmerica})

(def ^{:private true} Grenada
  {:db/ident :lcc-3166-1/Grenada,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Guadeloupe
  {:db/ident :lcc-3166-1/Guadeloupe,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Guam
  {:db/ident :lcc-3166-1/Guam,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Guatemala
  {:db/ident :lcc-3166-1/Guatemala,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} Guernsey
  {:db/ident :lcc-3166-1/Guernsey,
   :lcc-cr/isSubregionOf :lcc-m49/ChannelIslands})

(def ^{:private true} Guinea
  {:db/ident :lcc-3166-1/Guinea,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Guinea-Bissau
  {:db/ident :lcc-3166-1/Guinea-Bissau,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Guyana
  {:db/ident :lcc-3166-1/Guyana,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Haiti
  {:db/ident :lcc-3166-1/Haiti,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} HeardIslandAndMcDonaldIslands
  {:db/ident :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} HolySee
  {:db/ident :lcc-3166-1/HolySee,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Honduras
  {:db/ident :lcc-3166-1/Honduras,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} HongKong
  {:db/ident :lcc-3166-1/HongKong,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} Hungary
  {:db/ident :lcc-3166-1/Hungary,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Iceland
  {:db/ident :lcc-3166-1/Iceland,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} India
  {:db/ident :lcc-3166-1/India,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Indonesia
  {:db/ident :lcc-3166-1/Indonesia,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Iran
  {:db/ident :lcc-3166-1/Iran,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Iraq
  {:db/ident :lcc-3166-1/Iraq,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Ireland
  {:db/ident :lcc-3166-1/Ireland,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} IsleOfMan
  {:db/ident :lcc-3166-1/IsleOfMan,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Israel
  {:db/ident :lcc-3166-1/Israel,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Italy
  {:db/ident :lcc-3166-1/Italy,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Jamaica
  {:db/ident :lcc-3166-1/Jamaica,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Japan
  {:db/ident :lcc-3166-1/Japan,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} Jersey
  {:db/ident :lcc-3166-1/Jersey,
   :lcc-cr/isSubregionOf :lcc-m49/ChannelIslands})

(def ^{:private true} Jordan
  {:db/ident :lcc-3166-1/Jordan,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Kazakhstan
  {:db/ident :lcc-3166-1/Kazakhstan,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAsia})

(def ^{:private true} Kenya
  {:db/ident :lcc-3166-1/Kenya,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Kiribati
  {:db/ident :lcc-3166-1/Kiribati,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} KoreaDemocraticPeoplesRepublicOf
  {:db/ident :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} KoreaRepublicOf
  {:db/ident :lcc-3166-1/KoreaRepublicOf,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} Kuwait
  {:db/ident :lcc-3166-1/Kuwait,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Kyrgyzstan
  {:db/ident :lcc-3166-1/Kyrgyzstan,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAsia})

(def ^{:private true} LaoPeoplesDemocraticRepublic
  {:db/ident :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Latvia
  {:db/ident :lcc-3166-1/Latvia,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Lebanon
  {:db/ident :lcc-3166-1/Lebanon,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Lesotho
  {:db/ident :lcc-3166-1/Lesotho,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAfrica})

(def ^{:private true} Liberia
  {:db/ident :lcc-3166-1/Liberia,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Libya
  {:db/ident :lcc-3166-1/Libya,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} Liechtenstein
  {:db/ident :lcc-3166-1/Liechtenstein,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Lithuania
  {:db/ident :lcc-3166-1/Lithuania,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Luxembourg
  {:db/ident :lcc-3166-1/Luxembourg,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Macao
  {:db/ident :lcc-3166-1/Macao,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} Madagascar
  {:db/ident :lcc-3166-1/Madagascar,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Malawi
  {:db/ident :lcc-3166-1/Malawi,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Malaysia
  {:db/ident :lcc-3166-1/Malaysia,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Maldives
  {:db/ident :lcc-3166-1/Maldives,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Mali
  {:db/ident :lcc-3166-1/Mali,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Malta
  {:db/ident :lcc-3166-1/Malta,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} MarshallIslands
  {:db/ident :lcc-3166-1/MarshallIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Martinique
  {:db/ident :lcc-3166-1/Martinique,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Mauritania
  {:db/ident :lcc-3166-1/Mauritania,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Mauritius
  {:db/ident :lcc-3166-1/Mauritius,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Mayotte
  {:db/ident :lcc-3166-1/Mayotte,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Mexico
  {:db/ident :lcc-3166-1/Mexico,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} Micronesia
  {:db/ident :lcc-3166-1/Micronesia,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Moldova
  {:db/ident :lcc-3166-1/Moldova,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Monaco
  {:db/ident :lcc-3166-1/Monaco,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} Mongolia
  {:db/ident :lcc-3166-1/Mongolia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAsia})

(def ^{:private true} Montenegro
  {:db/ident :lcc-3166-1/Montenegro,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Montserrat
  {:db/ident :lcc-3166-1/Montserrat,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Morocco
  {:db/ident :lcc-3166-1/Morocco,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} Mozambique
  {:db/ident :lcc-3166-1/Mozambique,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Myanmar
  {:db/ident :lcc-3166-1/Myanmar,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Namibia
  {:db/ident :lcc-3166-1/Namibia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAfrica})

(def ^{:private true} Nauru
  {:db/ident :lcc-3166-1/Nauru,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Nepal
  {:db/ident :lcc-3166-1/Nepal,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Netherlands
  {:db/ident :lcc-3166-1/Netherlands,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} NewCaledonia
  {:db/ident :lcc-3166-1/NewCaledonia,
   :lcc-cr/isSubregionOf :lcc-m49/Melanesia})

(def ^{:private true} NewZealand
  {:db/ident :lcc-3166-1/NewZealand,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} Nicaragua
  {:db/ident :lcc-3166-1/Nicaragua,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} Niger
  {:db/ident :lcc-3166-1/Niger,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Nigeria
  {:db/ident :lcc-3166-1/Nigeria,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Niue
  {:db/ident :lcc-3166-1/Niue,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} NorfolkIsland
  {:db/ident :lcc-3166-1/NorfolkIsland,
   :lcc-cr/isSubregionOf :lcc-m49/AustraliaAndNewZealand})

(def ^{:private true} NorthMacedonia
  {:db/ident :lcc-3166-1/NorthMacedonia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} NorthernMarianaIslands
  {:db/ident :lcc-3166-1/NorthernMarianaIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Norway
  {:db/ident :lcc-3166-1/Norway,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Oman
  {:db/ident :lcc-3166-1/Oman,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Pakistan
  {:db/ident :lcc-3166-1/Pakistan,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Palau
  {:db/ident :lcc-3166-1/Palau,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} Palestine
  {:db/ident :lcc-3166-1/Palestine,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Panama
  {:db/ident :lcc-3166-1/Panama,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAmerica})

(def ^{:private true} PapuaNewGuinea
  {:db/ident :lcc-3166-1/PapuaNewGuinea,
   :lcc-cr/isSubregionOf :lcc-m49/Melanesia})

(def ^{:private true} Paraguay
  {:db/ident :lcc-3166-1/Paraguay,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Peru
  {:db/ident :lcc-3166-1/Peru,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Philippines
  {:db/ident :lcc-3166-1/Philippines,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Pitcairn
  {:db/ident :lcc-3166-1/Pitcairn,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} Poland
  {:db/ident :lcc-3166-1/Poland,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Portugal
  {:db/ident :lcc-3166-1/Portugal,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} PuertoRico
  {:db/ident :lcc-3166-1/PuertoRico,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Qatar
  {:db/ident :lcc-3166-1/Qatar,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Reunion
  {:db/ident :lcc-3166-1/Reunion,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Romania
  {:db/ident :lcc-3166-1/Romania,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} RussianFederation
  {:db/ident :lcc-3166-1/RussianFederation,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Rwanda
  {:db/ident :lcc-3166-1/Rwanda,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} SaintBarthelemy
  {:db/ident :lcc-3166-1/SaintBarthelemy,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} SaintHelena
  {:db/ident :lcc-3166-1/SaintHelena,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} SaintKittsAndNevis
  {:db/ident :lcc-3166-1/SaintKittsAndNevis,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} SaintLucia
  {:db/ident :lcc-3166-1/SaintLucia,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} SaintMartin
  {:db/ident :lcc-3166-1/SaintMartin,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} SaintPierreAndMiquelon
  {:db/ident :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAmerica})

(def ^{:private true} SaintVincentAndTheGrenadines
  {:db/ident :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Samoa
  {:db/ident :lcc-3166-1/Samoa,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} SanMarino
  {:db/ident :lcc-3166-1/SanMarino,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} SaoTomeAndPrincipe
  {:db/ident :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-cr/isSubregionOf :lcc-m49/MiddleAfrica})

(def ^{:private true} SaudiArabia
  {:db/ident :lcc-3166-1/SaudiArabia,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Senegal
  {:db/ident :lcc-3166-1/Senegal,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Serbia
  {:db/ident :lcc-3166-1/Serbia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} Seychelles
  {:db/ident :lcc-3166-1/Seychelles,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} SierraLeone
  {:db/ident :lcc-3166-1/SierraLeone,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Singapore
  {:db/ident :lcc-3166-1/Singapore,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} SintMaarten
  {:db/ident :lcc-3166-1/SintMaarten,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Slovakia
  {:db/ident :lcc-3166-1/Slovakia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} Slovenia
  {:db/ident :lcc-3166-1/Slovenia,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} SolomonIslands
  {:db/ident :lcc-3166-1/SolomonIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Melanesia})

(def ^{:private true} Somalia
  {:db/ident :lcc-3166-1/Somalia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} SouthAfrica
  {:db/ident :lcc-3166-1/SouthAfrica,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAfrica})

(def ^{:private true} SouthGeorgiaAndTheSouthSandwichIslands
  {:db/ident :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} SouthSudan
  {:db/ident :lcc-3166-1/SouthSudan,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Spain
  {:db/ident :lcc-3166-1/Spain,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernEurope})

(def ^{:private true} SriLanka
  {:db/ident :lcc-3166-1/SriLanka,
   :lcc-cr/isSubregionOf :lcc-m49/SouthernAsia})

(def ^{:private true} Sudan
  {:db/ident :lcc-3166-1/Sudan,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} Suriname
  {:db/ident :lcc-3166-1/Suriname,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} SvalbardAndJanMayen
  {:db/ident :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Sweden
  {:db/ident :lcc-3166-1/Sweden,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} Switzerland
  {:db/ident :lcc-3166-1/Switzerland,
   :lcc-cr/isSubregionOf :lcc-m49/WesternEurope})

(def ^{:private true} SyrianArabRepublic
  {:db/ident :lcc-3166-1/SyrianArabRepublic,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Tajikistan
  {:db/ident :lcc-3166-1/Tajikistan,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAsia})

(def ^{:private true} Tanzania
  {:db/ident :lcc-3166-1/Tanzania,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Thailand
  {:db/ident :lcc-3166-1/Thailand,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Timor-Leste
  {:db/ident :lcc-3166-1/Timor-Leste,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} Togo
  {:db/ident :lcc-3166-1/Togo,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAfrica})

(def ^{:private true} Tokelau
  {:db/ident :lcc-3166-1/Tokelau,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} Tonga
  {:db/ident :lcc-3166-1/Tonga,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} TrinidadAndTobago
  {:db/ident :lcc-3166-1/TrinidadAndTobago,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Tunisia
  {:db/ident :lcc-3166-1/Tunisia,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} Turkey
  {:db/ident :lcc-3166-1/Turkey,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Turkmenistan
  {:db/ident :lcc-3166-1/Turkmenistan,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAsia})

(def ^{:private true} TurksAndCaicosIslands
  {:db/ident :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} Tuvalu
  {:db/ident :lcc-3166-1/Tuvalu,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} Uganda
  {:db/ident :lcc-3166-1/Uganda,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Ukraine
  {:db/ident :lcc-3166-1/Ukraine,
   :lcc-cr/isSubregionOf :lcc-m49/EasternEurope})

(def ^{:private true} UnitedArabEmirates
  {:db/ident :lcc-3166-1/UnitedArabEmirates,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} UnitedKingdomOfGreatBritainAndNorthernIreland
  {:db/ident :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope})

(def ^{:private true} UnitedStatesMinorOutlyingIslands
  {:db/ident :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-cr/isSubregionOf :lcc-m49/Micronesia})

(def ^{:private true} UnitedStatesOfAmerica
  {:db/ident :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAmerica})

(def ^{:private true} Uruguay
  {:db/ident :lcc-3166-1/Uruguay,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} Uzbekistan
  {:db/ident :lcc-3166-1/Uzbekistan,
   :lcc-cr/isSubregionOf :lcc-m49/CentralAsia})

(def ^{:private true} Vanuatu
  {:db/ident :lcc-3166-1/Vanuatu,
   :lcc-cr/isSubregionOf :lcc-m49/Melanesia})

(def ^{:private true} Venezuela
  {:db/ident :lcc-3166-1/Venezuela,
   :lcc-cr/isSubregionOf :lcc-m49/SouthAmerica})

(def ^{:private true} VietNam
  {:db/ident :lcc-3166-1/VietNam,
   :lcc-cr/isSubregionOf :lcc-m49/South-easternAsia})

(def ^{:private true} VirginIslandsBritish
  {:db/ident :lcc-3166-1/VirginIslandsBritish,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} VirginIslandsUS
  {:db/ident :lcc-3166-1/VirginIslandsUS,
   :lcc-cr/isSubregionOf :lcc-m49/Caribbean})

(def ^{:private true} WallisAndFutuna
  {:db/ident :lcc-3166-1/WallisAndFutuna,
   :lcc-cr/isSubregionOf :lcc-m49/Polynesia})

(def ^{:private true} WesternSahara
  {:db/ident :lcc-3166-1/WesternSahara,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernAfrica})

(def ^{:private true} Yemen
  {:db/ident :lcc-3166-1/Yemen,
   :lcc-cr/isSubregionOf :lcc-m49/WesternAsia})

(def ^{:private true} Zambia
  {:db/ident :lcc-3166-1/Zambia,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})

(def ^{:private true} Zimbabwe
  {:db/ident :lcc-3166-1/Zimbabwe,
   :lcc-cr/isSubregionOf :lcc-m49/EasternAfrica})