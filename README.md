# TypeScript Test File Generator for WebStorm

This is a plugin for WebStorm or IntelliJ that adds an action to create test file and open in instantly.

 - The test files will be created next to the target file in the \_\_tests__ folder.
 - The test file will have the name pattern: \*.test.ts

## Installation

Download the JAR file from [Releases](https://github.com/keriati/ts-spec-generator/releases/tag/v0.2.1) and select the Install From File option in the Settings Panel of Plugins inside WebStorm.

## Usage

In the Code menu press __Create TypeScript test file__ or use the Action panel (Cmd+Shift+a).

## Configuration

The generated template can be changed in *Settings* > *Languages & Frameworks* > *TypeScript Test File Generator*.

Example template:

    import { $ClassName$ } from '../$ClassName$';

    describe('$ClassName$', () => {
        it('', () => {
            new $ClassName$();
        });
    });

