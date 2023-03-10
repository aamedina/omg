(ns net.wikipunk.rdf.cmns-dsg
  "The designators ontology defines commonly used concepts for naming, derived in part from the patterns defined in ISO 1087 for terminology work and ISO 11179-3, Metadata Registries. It includes several very high level semiotic relationships, including defines, describes, and denotes for associating designators with the concepts they reference."
  {:cmns-av/copyright ["Copyright (c) 2021-2022 Working Ontologist LLC"
                       "Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2021-2022 agnos.ai U.K. Ltd"
                       "Copyright (c) 2021-2022 Mayo Clinic"
                       "Copyright (c) 2014-2022 Thematix Partners LLC"],
   :dcterms/abstract
   "The designators ontology defines commonly used concepts for naming, derived in part from the patterns defined in ISO 1087 for terminology work and ISO 11179-3, Metadata Registries.  It includes several very high level semiotic relationships, including defines, describes, and denotes for associating designators with the concepts they reference.",
   :dcterms/contributor ["Dean Allemang, Working Ontologist"
                         "Davide Sottara, Mayo Clinic"
                         "Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/TextDatatype/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/20220501/Designators/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-dsg",
   :rdfa/uri "https://www.omg.org/spec/Commons/Designators/",
   :rdfs/label "Commons Designators Ontology",
   :skos/note
   "The designators ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to the inclusion of one minimum cardinality constraint (which is tyically ignored, but is important - see note on the Designator class) and two value restrictions. These constraints can be removed if required to support OWL RL rule-based applications that cannot be extended to support them."})

(def Designation
  "representation for someone or something by a sign that denotes it"
  {:cmns-av/synonym "designator",
   :db/ident :cmns-dsg/Designation,
   :dcterms/source
   "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09, clause 3.4.1",
   :rdf/type :owl/Class,
   :rdfs/label "designation",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :cmns-txt/hasTextValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-dsg/denotes,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "representation for someone or something by a sign that denotes it",
   :skos/note
   ["Note that the use of the min 0 cardinality restriction in the definition of this class is provided as a reminder that designators are expected, in many cases, to have a text value associated with them. There are cases where this is not true, however, including symbols.  And, there may be cases where the value is not known. Additionally, not all tools support rdf:langString, thus its use in the definition of the Text datatype may cause errors, for example in value and some number restrictions. Min 0 cardinality constraints are ignored by reasoners and other processors, so this allows us to say that the possible values for this property are likely either xsd:string or rdf:langString, but does not require it depending on the environment in which the ontology is deployed."
    "A designation can be a term including appellations, a proper name, or a symbol."
    "A designation can be linguistic or non-linguistic. It can consist of various types of characters, but also punctuation marks such as hyphens and parentheses, governed by domain-, subject-, or language-specific conventions."]})

(def Name
  "distinctive designation for an individual (person, organization or thing)"
  {:db/ident :cmns-dsg/Name,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/label "name",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/isNameOf,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     :cmns-dsg/Designation],
   :skos/definition
   "distinctive designation for an individual (person, organization or thing)"})

(def defines
  "specifies the meaning of something in terms of one or more of its essential qualities"
  {:db/ident :cmns-dsg/defines,
   :owl/inverseOf :cmns-dsg/isDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "defines",
   :rdfs/seeAlso ["https://plato.stanford.edu/entries/definitions/"],
   :skos/definition
   "specifies the meaning of something in terms of one or more of its essential qualities",
   :skos/note
   "A quality is an elementary characteristic of something. An 'essential quality' is one that provides a necessary criteria for being that thing and differentiating criteria for not being something else."})

(def denotes
  "serves as a sign for something"
  {:db/ident :cmns-dsg/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-dsg/Designation,
   :rdfs/label "denotes",
   :rdfs/seeAlso
   ["https://www.w3.org/2016/05/ontolex/"
    "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#"],
   :skos/definition "serves as a sign for something",
   :skos/note
   "Note that in some references, such as the semiotics ontology from Ontology Design Patterns,'denotes' can be used to talk about e.g. entities denoted by proper nouns: the proper noun 'Leonardo da Vinci' denotes the person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' denotes the collection of all persons in a domain of discourse. Other references that may be useful for interpreting 'denotes' include OntoLex. The interpretation of 'denotes' in this context is more general, but intended to reflect its usage in the semiotic triangle."})

(def describes
  "conveys the nature of"
  {:db/ident        :cmns-dsg/describes,
   :owl/inverseOf   :cmns-dsg/isDescribedBy,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "describes",
   :skos/definition "conveys the nature of"})

(def hasDescription
  "provides a textual statement, picture in words, or account that describes something"
  {:db/ident :cmns-dsg/hasDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has description",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "provides a textual statement, picture in words, or account that describes something",
   :skos/note
   "Note that the hasDescription property defined herein has an implicit range of rdfs:Literal. This is purposeful, so that users can specify any element that has a name with or without a language tag without concern for conflicting datatypes (i.e., xsd:string vs. rdf:langString, which are logically disjoint)."})

(def hasName
  "is known by"
  {:db/ident           :cmns-dsg/hasName,
   :owl/inverseOf      :cmns-dsg/isNameOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has name",
   :rdfs/range         :cmns-dsg/Name,
   :rdfs/subPropertyOf :cmns-dsg/isSignifiedBy,
   :skos/definition    "is known by"})

(def isDefinedIn
  "indicates something that specifies the meaning associated with the subject"
  {:db/ident :cmns-dsg/isDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is defined in",
   :skos/definition
   "indicates something that specifies the meaning associated with the subject",
   :skos/note
   "Typically, a concept, such as a classifier or identifier, will be defined in terms of a scheme, contract, specification, standard, or other reference."})

(def isDescribedBy
  "has general nature or description of"
  {:db/ident        :cmns-dsg/isDescribedBy,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is described by",
   :skos/definition "has general nature or description of"})

(def isNameOf
  "denotes in some context"
  {:db/ident           :cmns-dsg/isNameOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :cmns-dsg/Name,
   :rdfs/label         "is name of",
   :rdfs/subPropertyOf :cmns-dsg/denotes,
   :skos/definition    "denotes in some context"})

(def isSignifiedBy
  "has representation, denotation or sign of"
  {:db/ident        :cmns-dsg/isSignifiedBy,
   :owl/inverseOf   :cmns-dsg/denotes,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is signified by",
   :rdfs/range      :cmns-dsg/Designation,
   :skos/definition "has representation, denotation or sign of"})