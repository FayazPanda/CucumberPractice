$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cuke/kittens.feature");
formatter.feature({
  "line": 1,
  "name": "Search on Google",
  "description": "",
  "id": "search-on-google",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "search-on-google;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I search for \u003csearch\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Google will give me \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "search-on-google;;",
  "rows": [
    {
      "cells": [
        "search",
        "result"
      ],
      "line": 11,
      "id": "search-on-google;;;1"
    },
    {
      "cells": [
        "Kittens",
        "Kittens"
      ],
      "line": 12,
      "id": "search-on-google;;;2"
    },
    {
      "cells": [
        "Puppies",
        "Puppies"
      ],
      "line": 13,
      "id": "search-on-google;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2447515701,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I can open Google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleKittens.i_can_open_Google()"
});
formatter.result({
  "duration": 950257301,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "search-on-google;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I search for Kittens",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Google will give me Kittens",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleKittens.i_search_for_kittens()"
});
formatter.result({
  "duration": 47444899,
  "status": "passed"
});
formatter.match({
  "location": "GoogleKittens.google_will_give_me_Kittens()"
});
formatter.result({
  "duration": 1249197000,
  "status": "passed"
});
formatter.after({
  "duration": 527401399,
  "status": "passed"
});
formatter.before({
  "duration": 2112409000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I can open Google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleKittens.i_can_open_Google()"
});
formatter.result({
  "duration": 849365300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-on-google;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I search for Puppies",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Google will give me Puppies",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleKittens.i_search_for_puppies()"
});
formatter.result({
  "duration": 41189999,
  "status": "passed"
});
formatter.match({
  "location": "GoogleKittens.google_will_return_a_puppies_search()"
});
formatter.result({
  "duration": 1625822399,
  "status": "passed"
});
formatter.after({
  "duration": 539739600,
  "status": "passed"
});
});