

#  LDkit  [![](https://img.shields.io/badge/Issues-0%2B-brightgreen.svg)](https://github.com/tangyou79/LDkit) [![](https://img.shields.io/badge/Release-v1.0.0-blue.svg)](https://github.com/tangyou79/LDkit)

## a parallel computing toolkit for linkage disequilibrium analysis
</br>
<p align="center" >
<a>
<img src="resutl/logo.png" >
</a>
</p>

</br>


- [Pre-requirement](##Pre-requirement)
- [Installation](##Installation)
- [File Format](##FileFormat)
    - [Genotype](###)
    - [Subgroup](###)
- [Usage](##Usage:)
    - [Run using Graphic User Interface (GUI)](###Run)
    - [Steps for LD analysis](##)
        - [Step1: choose input files](##)
        - [Step2: set parameters for filtering variants](##)
        - [Step3: choose LD types](##)
        - [Step4: set parameters for plotting](##)
        - [Step5: checking your settings]()
        - [Step6: Run]()
        - [Notes]()
    - [Run using command line](##)
        - [Step1: LD analysis]()
        - [Step 2: Plot]()
- [Examples](##Examples:)

## Pre-requirement

</br>


JDK1.8 or above. It can be downloaded at:

[http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)


</br>

## Installation

</br>
LDkit is free of installation.

GUI package is under the GUI folder, please double-click the LDkit\_GUI.jar to start.

Executable file **LDkit.jar** for command line users is on the executable folder

</br>

## File Format

### Genotype:

Both PLINK ped and map format  and VCF format  are supported. VCF format could be compressed or uncompressed.

### Subgroup:

Subgroup should be formatted as:

        [subgroup1Name]:sample1,sample2,sample3…
        [subgroup2Name]:sample1,sample2,sample3…


</br>

## Usage:

### Run using Graphic User Interface (GUI):

GUI of LDkit is very easy to use. The main interface is like below:
<p align="center" >
<a>
<img src="resutl/7.png" height="250px" width="450px">
</a>
</p>

Figure1: Interface of LDkit

</br>

### Steps for LD analysis:


#### Step1: choose input files

<p align="center" >
<a>
<img src="resutl/1.png"  width="450px">
</a>
</p>

1 Genotype file could be dragged into the window;

2 Multiple genotype files could be put in the same folder, and then choose the folder as input

3 Other files must choose from disk.

</br>

#### Step2: set parameters for filtering variants

 
<p align="center" >
<a>
<img src="resutl/2.png" width="450px">
</a>
</p>

Window size: max distance between two variants (kb) for LD decay.

Missing rate: max ration of missing allele in the population.

Thread num: number of threads. Default is half of the available resources.

MAF: minor allele frequency

Output file: save output.

</br>

#### Step3: choose LD types

<p align="center" >
<a>
<img src="resutl/3.png"  width="450px">
</a>
</p>

Three types of LD analysis are supported by LDkit.  
LD site refer to the LD between a given site and a given region.

</br>

#### Step4: set parameters for plotting

1. This step could be skipped if you want to plot with other software.

2. If you want to plot with previous results, you could just input the previous results and adjust the parameters here. You needn&#39;t to run step1-step3 again.

<p align="center" >
<a>
<img src="resutl/4.png" width="450px">
</a>
</p>

InFile: none or previous results generated by LDkit.

Merge: if your input is a folder with multiple files, you could merge them all together as one population.

Mergechr: If your input is a file with multiple chromosomes, you could plot each chromosome by choosing no.

Bin: the size of bin for calculating mean r2 or D’. 

ResultName: file name for output.

</br>

#### Step5: choose LD measurements

<p align="center" >
<a>
<img src="resutl/5.png"  width="450px">
</a>
</p>

r2 or D’ could be chose here. 

</br>

#### Step5: checking your settings

Before you click start, you could check your parameters at right bottom.

<p align="center" >
<a>
<img src="resutl/6.png"  width="450px">
</a>
</p>

</br>

#### Step6: Run

After clicking the start button, the dynamic DNA strand shown above will run.

#### Notes:

1. If your input is a folder, you should make sure there is only file format. If more than one format in the folder, only the first appeared one will be used;

2. Do not support multiple files input for PLINK format;

3. PLINK format must be .ped and .map file suffix;

</br>

## Run using command line

### Step1: LD analysis:

java -jar LDkit.jar --input \&lt;input files\&gt; --output \&lt;output file\&gt; [parameters]

Parameters:

--input: input file or folder

--output: output file

--ws: max distance between two variants (kb) for LD decay. Default is 100 Kb.

--subpop: input of subgroup files;

--chr: chromosome name if you just want to calculate one or some of them. Multiple chromosomes should be separated by comma. Default is all.

--maf: minor allele frequency filter. Default is 0.005;

--threads: number of threads, default is 1.

--type: measurements of LD. 1 for r-sqaure, 2 for D prime. Default is 1.

--Intermediate save the LD file for LD block or not. Default is no.

--block: chr:start-end. Region for LD block or LD site. For example: chr1:1000-20000;

--site: chr:start-end chr:site. Given site for LD site. For example: chr1:1000-2000 chr1:24556--h: help

</br>

### Step 2: Plot

java -jar LDkit.jar --plot --input \&lt;input files\&gt; --output \&lt;output file\&gt; [parameters]

Parameters:

--inp: input file for plot

--merge: plot all subgroups in one figure or not. Default is yes.

--mergechr: plot all chromosomes or not. Default is yes.

--bin: the size of bin for calculating mean r2 or D&#39;.

</br>

## Examples:

1. LD decay for one population 
2. LD decay for partial chromosomes in a population 
3. LD decay for multiple subpopulations 
4. LD block analysis 
5. LD site analysis 
