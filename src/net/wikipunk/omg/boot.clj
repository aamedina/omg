(ns net.wikipunk.omg.boot
  {:rdf/type :jsonld/Context})

(def sm
  {:rdfa/uri    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
   :rdfa/prefix "sm"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-av
  {:rdfa/prefix "cmns-av"
   :rdfa/uri    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-cr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
   :rdfa/prefix "lcc-cr"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-lr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
   :rdfa/prefix "lcc-lr"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-m49
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"
   :rdfa/prefix "lcc-m49"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
   :rdfa/prefix "lcc-3166-1"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
   :rdfa/prefix "lcc-3166-2"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-639-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
   :rdfa/prefix "lcc-639-1"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-639-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
   :rdfa/prefix "lcc-639-2"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-2-ca
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA.rdf"
   :rdfa/prefix      "lcc-3166-2-ca"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-gb
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB.rdf"
   :rdfa/prefix      "lcc-3166-2-gb"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-mx
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX.rdf"
   :rdfa/prefix      "lcc-3166-2-mx"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-us
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US.rdf"
   :rdfa/prefix      "lcc-3166-2-us"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
   :rdf/type         :rdfa/PrefixMapping})

(def omg
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/omg/"
   :rdfa/prefix "omg"})
